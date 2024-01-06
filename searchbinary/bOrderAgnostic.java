package searchbinary;

public class bOrderAgnostic {
     public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int target = 8;
        int[] revarr=reverse(arr);
        int ans = orderbinarySearch(revarr, target);
        System.out.println(ans);
    }

    private static int orderbinarySearch(int[] arr, int target) {
        
        int start=0;
        int end=arr.length-1;
        boolean isAsec=false;
        if(arr[start]<arr[end])
        {
            isAsec=true;
        }
        
       
        while(start<=end){
             int mid=start+(end-start)/2;
            if(arr[mid]==target){
                int a=arr[mid];
                return mid;
            }
        if (isAsec){    
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
        }
        else{
            if(arr[mid]>target){
                start=mid+1;
            }
            if(arr[mid]<target){
                end=mid-1;
            }
        }
        }
        return -1;
    }
    static int[] reverse(int[] arr) {
       int start= 0;
       int end= arr.length-1;
       while(start<end){
        swap(arr,start,end);
        start++;
        end--;
       }
       return arr;
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
