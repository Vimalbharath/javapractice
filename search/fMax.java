package search;

import java.util.Arrays;

public class fMax {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    System.out.println(Arrays.toString(arr));
    int a=max(arr);
    System.out.println(a);

    
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
