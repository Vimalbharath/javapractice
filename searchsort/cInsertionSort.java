package searchsort;

import java.util.Arrays;

public class cInsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,0,1,-1,-2};
        insertion(arr);
        //swap(arr,)
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                    
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static void swapwithvalue(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}