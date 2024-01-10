package searchsort;

import java.util.ArrayList;

//https://leetcode.com/problems/find-the-duplicate-number/

public class hFindAllDuplicate {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1 };
        miss(nums);
        // swap(nums,)
        System.out.println(miss(nums));
    }

    private static ArrayList<Integer> miss(int[] nums) {
        int i = 0;
        ArrayList<Integer> vimal=new ArrayList<>();
        
        

        while (i < nums.length) {

        //    if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    vimal.add(nums[i]);
                    
               }
            //} else {
                int a = i++;

        //    }
        }
       return vimal;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
