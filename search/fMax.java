package search;

import java.util.Arrays;

public class fMax {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    System.out.println(Arrays.toString(arr));
    int a=max(arr);
    System.out.println(a);
    int[] b=reverse(arr);
    System.out.println(Arrays.toString(b));
    }

    static int[] reverse(int[] arr) {
       int start= 0;
       int end= arr.length;
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


    static int max(int arr[]){
        int max=0;
        for (int i:arr) {
            if (i>max){
                max=i;
            }
        }
        return max;

    }
}
