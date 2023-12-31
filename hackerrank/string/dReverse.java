package hackerrank.string;

import java.util.Scanner;

public class dReverse {
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String newStr = String.valueOf(new StringBuilder(A).reverse());
        if(A.equals(newStr)){
            System.out.println("Yes");
        } else {
            System.out.println("No");;
        }
        
        
    }
}
