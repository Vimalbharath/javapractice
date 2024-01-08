package searchbinary;

import java.util.Arrays;

public class kRowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 49)));
    }

    private static int[] search(int[][] arr, int i) {
       int r=0;
       int c=arr[r].length-1;
       while(r<arr.length&&c>=0){
        if(arr[r][c]==i){
            return new int[]{r,c};
        }
        if(arr[r][c]<i){
            r++;
        
        }
        else{
           c--;
        }
       }
       return new int[]{-1,-1};
    }
}
