package searchl;

import java.util.Arrays;

public class dMin {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    System.out.println(Arrays.toString(arr));
    int a=min(arr);
    System.out.println(a);
    }

    private static int min(int[] arr) {
         int min=Integer.MAX_VALUE;
        for (int i:arr) {
            if (i<min){
                min=i;
            }
        }
        return min;
    }
}
