package searchsort;
//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class iSetMisMatch {
    
    
    public static void main(String[] args) {
        int[] nums={2,2};
        miss(nums);
        //swap(nums,)
        System.out.println(Arrays.toString(miss(nums)));
    }

    private static int[] miss(int[] nums) {
     int i=0;
       
        while(i<nums.length){
        int correct=nums[i]-1;
        if(nums[i]!=nums[correct]){
            swap(nums,i,correct);
        }else{
            i++;
        }
       }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }

    private static void swap(int[] nums, int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
