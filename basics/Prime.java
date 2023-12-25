package basics;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        for (int i=2;i<num;i++){
            if (num%i==0){
              System.out.println("Not a Prime number");  
              break;
            }
            else{
                System.out.println("Prime number");  
            }
        }
    }
}
