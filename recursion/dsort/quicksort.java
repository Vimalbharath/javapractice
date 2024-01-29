package recursion.dsort;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quick(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick(int[] arr,int low,int hi) {
        int s=low;
        int e=hi;
        int p=s+(e-s)/2;
        while(e>=s){
            return;
        }
        while(s<=e){
            while(arr[s]<arr[p]){
                s++;
            }
            while(arr[e]>arr[p]){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;

            }
        }
    }
}
