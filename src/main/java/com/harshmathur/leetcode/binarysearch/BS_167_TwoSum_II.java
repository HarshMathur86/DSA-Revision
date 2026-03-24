package com.harshmathur.leetcode.binarysearch;

import java.util.Arrays;

class BS_167_TwoSum_II {

    static void main() {
        IO.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        // thi is hasmap solution from 2 sum
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left+1, right+1};
            } else if (sum < target) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return new int[]{0, 0};
    }
}