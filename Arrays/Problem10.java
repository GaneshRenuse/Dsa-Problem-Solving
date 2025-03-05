/*
* Problem Statement : 
Problem Statement:
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

* Example:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]  
Output: 6  
Explanation: [4,-1,2,1] has the largest sum = 6.

* Test Cases:

Input: [1] → Output: 1
Input: [5,4,-1,7,8] → Output: 23
Input: [-1,-2,-3,-4] → Output: -1 (Handles all negative numbers)
Input: [0,0,0,0] → Output: 0 (Handles all zeros)
Input: [-2, -1] → Output: -1

* Hint:
Try to maintain the maximum sum ending at each
position and keep track of the overall maximum sum.
Give it a try, and share your code once done!
*/

import java.util.*;

public class Problem10 {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i=1; i<nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] testcase1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(testcase1));

        int[] testcase2 = {1};
        System.out.println(maxSubArray(testcase2));

        int[] testcase3 = {5,4,-1,7,8};
        System.out.println(maxSubArray(testcase3));

        int[] testcase4 = {-1,-2,-3,-4};
        System.out.println(maxSubArray(testcase4));

        int[] testcase5 = {0,0,0,0};
        System.out.println(maxSubArray(testcase5));

        int[] testcase6 = {-2, -1};
        System.out.println(maxSubArray(testcase6));
    }
}