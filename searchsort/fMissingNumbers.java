package searchsort;

import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/missing-number/

public class fMissingNumbers {
      public static void main(String[] args) {
        int[] nums={3,4,2,1,5};
        miss(nums);
        //swap(nums,)
        System.out.println(miss(nums));
    }

    private static ArrayList<Integer> miss(int[] nums) {
     int i=0;
       
        while(i<nums.length){
        int correct=nums[i]-1;
        if(nums[i]<nums.length&&nums[i]!=nums[correct]){
            swap(nums,i,correct);
        }else{
            i++;
        }
       }
         ArrayList<Integer> vimal=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                vimal.add(j);
            }
        }
        return vimal;
    }

    private static void swap(int[] nums, int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
