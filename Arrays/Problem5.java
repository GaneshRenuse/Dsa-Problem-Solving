/*
Problem Statement:
You are given an array nums of integers where some elements appear twice, and others appear once.
Find all the elements that appear twice in O(n) time and O(1) extra space.

Constraints:
You must not use extra space (except for the output list).
The numbers are in the range [1, n], where n = nums.length.
The solution should run in O(n) time.

Examples :
Input : int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
Output : [2, 3]
*/

import java.util.*;

public class Problem5 {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = findDuplicates(nums);
        System.out.println(ans);
    }
}
