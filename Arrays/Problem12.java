/*
Problem Statement : 
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
*/

import java.util.*;

public class Problem12 {
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] testcase1 = {1,2,3,1};
        System.out.println(containsDuplicate(testcase1));

        int[] testcase2 = {1,2,3,4};
        System.out.println(containsDuplicate(testcase2));

        //test your own testcases
    }
}