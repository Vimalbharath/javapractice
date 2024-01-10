package searchsort;

import java.util.ArrayList;

//https://leetcode.com/problems/find-the-duplicate-number/

public class hFindAllDuplicate {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        miss(nums);
        // swap(nums,)
        System.out.println(miss(nums));
    }

    private static ArrayList<Integer> miss(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        ArrayList<Integer> vimal = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j) {
                vimal.add(nums[j]);
            }
        }
        return vimal;

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
