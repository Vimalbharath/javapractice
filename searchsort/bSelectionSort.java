package searchsort;

import java.util.Arrays;

public class bSelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,0,1,-1,-2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int start=0;
            int last=arr.length-1-i;
            int max=getMax(arr,start,last);
            swap(arr,max,last);
        }
    }

    private static void swap(int[] arr, int max, int last) {

        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }

    private static int getMax(int[] arr, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++){
            
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
        

    }
}
