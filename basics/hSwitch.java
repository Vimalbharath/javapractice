package basics;

import java.util.Scanner;

public class hSwitch {
    
public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt(); 
        switch(num){
        case 1,2,3,4,5 -> System.out.println("Weekday");
        case 6,7 -> System.out.println("Weekoff");
        }
    }

}
