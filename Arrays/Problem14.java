/*
Problem Statement:
Given an integer array nums where every element appears twice except for one. 
Find that single one.

Constraints :
You must implement a solution with a linear runtime complexity,
and use only constant extra space. (Optional)

Example:
Input: [4, 1, 2, 1, 2]
Output: 4

Test Cases:
Input: [2, 2, 1]
Output: 1

Input: [1]
Output: 1

Input: [0, 1, 0, 1, 99]
Output: 99

Input: [10, 10, 20, 20, 30]
Output: 30
*/

import java.util.*;

public class Problem14 {
    public static int findUnique(int[] nums) { //O(n) time complexity, O(n) space complexity
        int unique = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) == 1) {
                unique = key;
                break;
            }
        }

        return unique;
    }
    public static void main(String[] args)
    {
        int[] testcase1 = {4, 1, 2, 1, 2};
        System.out.println(findUnique(testcase1));
    }
}