package searchsort;

import java.util.Arrays;

public class cInsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,arr[j-1],arr[j]);
                    
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
    }
}