package search;

import java.util.Scanner;

public class dio {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int a= scan.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i] = scan.nextInt();
        }

        for(int j=0;j<arr.length;j++){
        System.out.print(arr[j]);
        }

        for(int z : arr){System.out.print(z);}
        
    }
}
