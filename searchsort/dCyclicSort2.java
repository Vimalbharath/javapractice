package searchsort;

import java.util.Arrays;
//if given in the question 1-N

public class dCyclicSort2 {
     public static void main(String[] args) {
        int[] arr={3,4,2,1,5};
        cycle(arr);
        //swap(arr,)
        System.out.println(Arrays.toString(arr));
    }

    private static void cycle(int[] arr) {
       int i=0;
       
       while(i<arr.length){
        int correct=arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
        }else{
            i++;
        }
       }
    }

    private static void swap(int[] arr, int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
