/*
Problem Statement
Given an array of integers, find the second-largest element in the array.
If there is no second-largest element (i.e., all elements are the same or there's only one element), return -1.

Example 1:
Input: nums = [10, 20, 4, 45, 99, 99]
Output: 45
Explanation: The largest element is 99, and the second largest is 45.

Example 2:
Input: nums = [3, 3, 3]
Output: -1
Explanation: There is no second-largest element as all elements are the same.

Example 3:
Input: nums = [5]
Output: -1
Explanation: There's only one element, so no second largest exists.

Constraints:
1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9

Test Cases to run :
int[] nums1 = {10, 20, 4, 45, 99, 99}; // Expected: 45
int[] nums2 = {3, 3, 3}; // Expected: -1
int[] nums3 = {5}; // Expected: -1
int[] nums4 = {-5, -2, -8, -1}; // Expected: -2
int[] nums5 = {1, 2, 3, 4, 5}; // Expected: 4
*/

public class Problem2 {
    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) return -1;

        int maximum = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > maximum) {
                secondLargest = maximum;
                maximum = num;
            } else if (num > secondLargest && num < maximum) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] testcase1 = {10, 20, 4, 45, 99, 99};
        System.out.println(findSecondLargest(testcase1));

        int[] testcase2 = {3, 3, 3};
        System.out.println(findSecondLargest(testcase2));

        int[] testcase3 = {5};
        System.out.println(findSecondLargest(testcase3));

        int[] testcase4 = {-5, -2, -8, -1};
        System.out.println(findSecondLargest(testcase4));

        int[] testcase5 = {1, 2, 3, 4, 5};
        System.out.println(findSecondLargest(testcase5));
    }
}
