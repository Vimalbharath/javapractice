package recursion.carrays;

public class RBS {
    public static void main(String[] args) {
        int[] arr={6,7,8,9,1,2,3,4,5};
        int target=9;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    private static int search(int[] arr, int target,int start,int end) {
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>=arr[start]){
            if(arr[mid]>=target&&target<=arr[start]){
                return search(arr,target,start,mid-1);
            }
            else{
                return search(arr,target,mid+1,end);
            }
        }
         if(arr[mid]<=target && target<=arr[end]){
                return search(arr,target,mid+1,end);
            }
            else{
                return search(arr,target,start,mid-1);
            }

    }
}
