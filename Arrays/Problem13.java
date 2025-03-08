/*
Problem Statement : 
You are given an array nums of size n. 
The majority element is the element that appears more than n/2 times. 
You may assume that the array is non-empty and the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:
n == nums.length
1 <= n <= 5 * 10^4
-10^9 <= nums[i] <= 10^9
*/

import java.util.*;

public class Problem13 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/2){
                return key;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int[] testcase1 = {3,2,3};
        System.out.println(majorityElement(testcase1));

        int[] testcase2 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(testcase2));

        //test your own testcases
    }
}