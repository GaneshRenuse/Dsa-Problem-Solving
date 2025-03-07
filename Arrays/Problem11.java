/*
Problem Statement : 
Given an array nums of n integers where n > 1,
return an array output such that output[i] is equal to the
product of all the elements of nums except nums[i].

Example : 
Input: nums = [1, 2, 3, 4]  
Output: [24, 12, 8, 6]

Constraints:
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using division.

Test Cases : 
Input: [1, 2, 3, 4]  
Output: [24, 12, 8, 6]  

Input: [0, 1, 2, 3]  
Output: [6, 0, 0, 0]  

Input: [-1, 1, 0, -3, 3]  
Output: [0, 0, 9, 0, 0]  

Input: [2, 3]  
Output: [3, 2]  

Input: [5]  
Output: [] // Invalid, n > 1 constraint
*/

import java.util.*;

public class Problem11 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
    
        // Step 1: Fill output array with left products
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
    
        // Step 2: Calculate right products on the fly
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
    
        return output;
    }

    public static void main(String[] args) {
        int[] testcase1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(testcase1)));
    }
}