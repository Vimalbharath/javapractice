package searchbinary;

public class binarysearch {
     public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<end){
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<=target){
                start=mid+1;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
        }
        return -1;
    }
}
