/*
Problem Statement :
Given an integer array nums, return the third distinct maximum number in this array.
If the third maximum does not exist, return the maximum number.

Example 1:
Input: nums = [3, 2, 1]
Output: 1

Explanation: The first maximum is 3, second is 2, third is 1.

Constraints:
1 <= nums.length <= 10^4
-2^31 <= nums[i] <= 2^31 - 1
*/

import java.util.*;

public class Problem16 {
    public static int thirdDistinctMaximum(int[] nums) {
        Integer first = null, second = null, third = null;

        for (int num : nums) {
            if ((first != null && num == first) || (second != null && num == second) || (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }

        return third == null ? first : third;
    }

    public static void main(String[] args) {
        int[] test1 = {3, 2, 1};
        System.out.println(thirdDistinctMaximum(test1)); // Output: 1

        int[] test2 = {1, 2};
        System.out.println(thirdDistinctMaximum(test2)); // Output: 2

        int[] test3 = {1, 2, 2, 5, 3, 5};
        System.out.println(thirdDistinctMaximum(test3));
    }
}
