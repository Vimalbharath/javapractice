package recursion.dsort;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 8, 2, 4};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick(int[] arr,int low,int hi) {
        int s=low;
        int e=hi;
        int p=s+(e-s)/2;
        while(low>=hi){
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
                s++;
                e--;
            }
        }
        quick(arr,low,e);
        quick(arr,s,hi);
    }
}
