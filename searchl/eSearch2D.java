package searchl;

import java.util.Arrays;

public class eSearch2D {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6,7},
            {8,9}
        };

        for(int[] val:arr){
            System.out.println(Arrays.toString(val));
        }

        int[] ans=search2d(arr,10);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] search2d(int[][] arr, int i) {
        for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
            if(arr[row][col]==i){
                return new int[] {row,col};
            }
        }
        }
        return null;
    }
}
