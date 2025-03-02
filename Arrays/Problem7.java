/*
Problem Statement : 
You are given a sorted array nums. 
You need to remove the duplicates in place such that each element appears only once and return the new length. 
The relative order of the elements should be kept the same.
Since the array is sorted, the duplicates will be consecutive.

Example:
Input: nums = [1, 1, 2]
Output: 2, nums = [1, 2, _]

Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
Output: 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]

Constraints:
1 <= nums.length <= 10^4
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.

Test Cases:
nums = [1, 1, 1, 1, 1] → Output: 1, nums = [1, _, _, _, _]
nums = [1, 2, 3, 4, 5] → Output: 5, nums = [1, 2, 3, 4, 5]
nums = [0, 0, 1, 1, 2, 2, 3, 3, 4, 4] → Output: 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
nums = [1] → Output: 1, nums = [1]
nums = [1, 2, 2, 3, 4, 4, 4, 5, 6, 6] → Output: 6, nums = [1, 2, 3, 4, 5, 6, _, _, _, _]
*/

import java.util.*;

public class Problem7 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; //edge case
        int i = 1;
        int j = 1;

        for (j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i++] = nums[j];
            }
        }

        return i;
    }
    
    public static void main(String[] args)
    {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int k = removeDuplicates(nums);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}