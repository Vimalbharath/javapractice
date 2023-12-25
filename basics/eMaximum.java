package basics;
import java.util.Scanner;

public class eMaximum{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter three numbers:");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        int max=0;

        if (a>b){
            max=a;
        }
        else {
            max=b;
        }
        System.out.println("Maximum number is "+max);
    }
}