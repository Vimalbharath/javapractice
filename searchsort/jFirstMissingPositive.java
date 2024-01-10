package searchsort;

import java.util.Arrays;

//https://leetcode.com/problems/first-missing-positive/

public class jFirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = { 2, 2 };
        miss(nums);
        // swap(nums,)
        System.out.println((miss(nums)));
    }

    private static int miss(int[] nums) {

        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return nums.length;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}