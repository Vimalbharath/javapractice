package searchbinary;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class jRotatedBinary {

     public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 3;
        //int ans = RBS(arr,target);
       int ans = findpivot(arr);
        System.out.println(ans);
    }

   

    private static int RBS(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        int pivot=findpivot(arr);
        ans=binarySearch(arr, target, start, pivot);
        if(ans==-1){
            ans=binarySearch(arr, target, pivot+1,end);
        }
        return ans;
    }
    private static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        
        
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[end]<arr[mid] &&arr[mid+1]<arr[mid]){
                return mid;
            }
             if(arr[start]>arr[mid]&&arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int target,int start,int end) {
      
       
        while(start<=end){
             int mid=start+(end-start)/2;
            
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
           else{
                return mid;
            }
        }
        return -1;
    }

}