/*
Problem Statement :
Given an integer array nums, move all 0s to the end while maintaining the relative order of non-zero elements.
Do this in-place without making a copy of the array.

Example 1:
Input: nums = [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]

Example 2 :
Input: nums = [0, 0, 1]
Output: [1, 0, 0]

Constraints:
1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9

Your Task:
Write an efficient Java function to modify the array in-place.
Optimize for O(n) time complexity and O(1) space complexity.
*/

import java.util.*;

public class Problem6 {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        for (int i = count; i < n; i++) {
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
