package basics;
import java.util.Scanner;

public class cPrime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        int count=1;
        for (int i=2;i<num;i++){
            if (num%i==0){
               count++;
            }
            
        }
        if (count > 1){
            System.out.println("Not a Prime number"); 
        }
        else{
                System.out.println("Prime number");  
            }
        input.close();
    }
}
