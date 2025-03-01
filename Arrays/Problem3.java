/*
You are given an array containing n distinct numbers taken from the range 0 to n.
Since there is one missing number, find and return that missing number.

Example :
Input: nums = [3, 0, 1]
Output: 2

Input: nums = [0, 1]
Output: 2

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8

Constraints:
1 ≤ n ≤ 10⁴
0 ≤ nums[i] ≤ n
All numbers are distinct.
*/

public class Problem3 {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        System.out.println(findMissingNumber(nums1)); // Expected Output: 2

        int[] nums2 = {0, 1};
        System.out.println(findMissingNumber(nums2)); // Expected Output: 2

        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(findMissingNumber(nums3)); // Expected Output: 8

        int[] nums4 = {0};
        System.out.println(findMissingNumber(nums4)); // Expected Output: 1
    }
}
