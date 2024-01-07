package searchbinary;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/description/
//same question

public class hMountain {

     public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,8,7};
        // int target = 0;
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
     public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid+1]>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
}
