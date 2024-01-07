package searchbinary;

public class gInfiniteArray {
     public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int target = 9;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int target) {
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+ (end-start+1)*2;
            start=temp;
        }
        return SearchinRange(arr, target, start, end);
    }

    private static int SearchinRange(int[] arr, int target,int start,int end) {
        
       
        while(start<=end){
             int mid=start+(end-start)/2;
            
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
