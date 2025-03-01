/*
Problem 4: Find the Single Non-Duplicate Number
You are given a sorted array of integers where every element appears twice except for one element that appears only once.
Find and return the single element that appears only once.

Constraints:

The array is sorted in non-decreasing order.
Each number (except the single one) appears exactly twice.
You must solve this problem in O(log n) time complexity and O(1) space.

Example Test Cases:
Example 1
Input: nums = [1,1,2,2,3,3,4,5,5,6,6]
Output: 4
Explanation: Every number appears twice except 4.

Example 2
Input: nums = [10, 10, 11, 11, 15]
Output: 15

Example 3
Input: nums = [1]
Output: 1
*/

public class Problem4 {
    public static int FindSingleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(FindSingleNonDuplicate(nums1)); // Expected Output: 4

        int[] nums2 = {10, 10, 11, 11, 15};
        System.out.println(FindSingleNonDuplicate(nums2)); // Expected Output: 15

        int[] nums3 = {1};
        System.out.println(FindSingleNonDuplicate(nums3)); // Expected Output: 1

        // time complexity: O(n)
        // space complexity: O(1)
    }
}
