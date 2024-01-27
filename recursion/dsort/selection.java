package recursion.dsort;

import java.util.Arrays;

public class selection {
     public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 8, 2, 4 };
        selection1(arr, arr.length - 1, 0,0);
        System.out.println(Arrays.toString(arr));

    }

    private static void selection1(int[] arr, int row, int col,int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] < arr[max]) {
                swap(arr,col,max);
                
                }
                selection1(arr, row, col + 1,col);
            
        } else {

            selection1(arr, row - 1, 0,0);
        }
    }

    private static void swap(int[] arr, int num1, int num2 ) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }


}
