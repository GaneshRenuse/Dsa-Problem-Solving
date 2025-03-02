/*
Problem Statement :
You are given an integer array nums and an integer k.
You need to rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3
Output: [5, 6, 7, 1, 2, 3, 4]
Explanation:
Rotate 1 step to the right: [7, 1, 2, 3, 4, 5, 6]
Rotate 2 steps to the right: [6, 7, 1, 2, 3, 4, 5]
Rotate 3 steps to the right: [5, 6, 7, 1, 2, 3, 4]

Example 2:
Input: nums = [-1, -100, 3, 99], k = 2
Output: [3, 99, -1, -100]
Explanation:
Rotate 1 step to the right: [99, -1, -100, 3]
Rotate 2 steps to the right: [3, 99, -1, -100]

Constraints:
1 ≤ nums.length ≤ 10^5
−2^31 ≤nums[i]≤ 2^31 − 1
0 ≤ k ≤ 10^5

Hints:
Can you do it in O(1) space complexity?
Try to minimize unnecessary rotations by using k = k % nums.length.
*/

import java.util.*;

public class Problem8 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
    }
}