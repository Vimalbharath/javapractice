package hackerrank.string;

import java.util.Scanner;

public class fSplitregex {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        // Split on a symbol which is not in range of A-Z or a-z
        String[] tokens = s.split("[^A-Za-z]+");
        int n = tokens.length;
        if(n > 0){
            // If String s starts with a non alphabetic character, the split array's first element will be empty
            // Run the code with value of String ?aa
            // "?aa" only has one token "aa"
            n = tokens[0].isEmpty() ? n - 1 : n;
        }
        System.out.println(n);
        for(String token : tokens){
            if(!token.isEmpty()){
                System.out.println(token);            
            }
        }
        scan.close();
    }
}
