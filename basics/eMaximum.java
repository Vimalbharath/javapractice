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
        max=a;
        if (max<b){
            max=b;
        }
       if (max<c){
            max=c;
        }
        System.out.println("Maximum number is "+max);
    }
}