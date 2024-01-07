package searchbinary;

import java.util.Arrays;

public class fFirstLast {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int target = 1;
        int[] ans = firstlast(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] firstlast(int[] nums, int target) {
        int first=binarySearch(nums, target, true);
        int last=binarySearch(nums, target, false);
         return new int[]{first,last};
    }

    private static int binarySearch(int[] nums, int target,boolean first) {
        int ans=-1; 
        int start=0;
        int end=nums.length-1;
       
        while(start<=end){
             int mid=start+(end-start)/2;
            
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else {
                ans=mid;
                if(first){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            
        }
        return ans;
    }
}
