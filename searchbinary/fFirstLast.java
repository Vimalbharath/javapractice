package searchbinary;

import java.util.Arrays;

public class fFirstLast {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,4,4,4,4,5,6,7,8,9};
        int target = 4;
        int[] ans = binarySearch(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] binarySearch(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
       
        while(start<=end){
             int mid=start+(end-start)/2;
            
            if(nums[mid]<target){
                start=mid+1;
            }
            if(nums[mid]>target){
                end=mid-1;
            }
            if(nums[mid]==target){
                int midb=mid;
                int a=nums[mid];
                int b=nums[mid];
                while(nums[mid]==target){
                    mid++;
                    a=mid-1;
                }
                while(nums[midb]==target){
                    midb--;
                    b=midb+1;
                }
               
                return new int[]{a,b};
            }
        }
        return new int[]{-1,-1};
    }
}
