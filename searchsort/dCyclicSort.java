package searchsort;

import java.util.Arrays;
//if given in the question 1-N

public class dCyclicSort {
     public static void main(String[] args) {
        int[] arr={5,4,3,2,1,};
        cycle(arr);
        //swap(arr,)
        System.out.println(Arrays.toString(arr));
    }

    private static void cycle(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            while (arr[i]!=i+1) {
                swap(arr,i,arr[i]);
            }

        }
    }

    private static void swap(int[] arr, int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j-1];
        arr[j-1]=temp;
    }

}
