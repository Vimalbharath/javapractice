package basics;

import java.util.Scanner;

public class fFibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        int a=0;
        int b=1;
        int i=2;
        while(i<num){
            int temp =a;
            b=a+b;
            b=a;

        }
    }
}
