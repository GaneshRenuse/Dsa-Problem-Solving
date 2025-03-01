/*
Problem Statement : 
Given an array of integers nums, return the maximum number in the array.

Example 1:
Input:
nums = [3, 1, 7, 5, 9, 2]
Output: 9

Example 2:
Input:
nums = [-1, -5, -3, -10]
Output: -1

Example 3:
Input:
nums = [7]
Output: 7

Constraints:
1 <= nums.length <= 10^5
-10^6 <= nums[i] <= 10^6

Test Cases to Run:
int[] test1 = {3, 1, 7, 5, 9, 2}; // Expected output: 9
int[] test2 = {-1, -5, -3, -10};  // Expected output: -1
int[] test3 = {7};                // Expected output: 7
int[] test4 = {-1000000, 1000000}; // Expected output: 1000000
int[] test5 = {5, 5, 5, 5};       // Expected output: 5
*/

public class Problem1 {
    public static int FindMaximum(int[] nums) {
        if(nums.length == 0){
            return 0; // edge case
        }
        int Maximum = nums[0]; // current maximum number

        for (int i = 1; i < nums.length; i++) {
            Maximum = Math.max(nums[i], Maximum);
        }
        return Maximum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 5, 2, 4, 9, 8};
        System.out.println(FindMaximum(nums));
    }
}