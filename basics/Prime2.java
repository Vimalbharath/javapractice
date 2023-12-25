package basics;

import java.util.Scanner;

public class Prime2 {
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        int c=2;
        while (c*c<=num){
            if (num%c==0){
               System.out.println("Not a Prime number");
               return;
            }
            c++;
            
        }
        
        if(c*c>num){
                System.out.println("Prime number");  
            }
        input.close();
    }
    
}
