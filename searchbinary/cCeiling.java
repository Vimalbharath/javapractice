package searchbinary;

public class cCeiling {
     public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,6,7,8,9};
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
       
        while(start<=end){
             int mid=start+(end-start)/2;
            
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]==target){
                int a=arr[mid];
                return mid;
            }
        }
        return start;
    }
}
