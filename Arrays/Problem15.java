/*
Problem Statement : 
Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique, and the result can be in any order.

Example 1:
Input:
nums1 = [1,2,2,1]
nums2 = [2,2]

Output:[2]

Example 2:
Input:
nums1 = [4,9,5]
nums2 = [9,4,9,8,4]

Output:[4,9]

Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/

import java.util.*;

public class Problem15 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = intersection(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}