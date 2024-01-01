package hackerrank.string;

import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    // String userNamePattern =  "^[A-Za-z][A-Za-z0-9_]{7,29}$";
    
    public static final String regularExpression ="^[A-Za-z][A-Za-z0-9_]{7,29}$";
    //Pattern userPattern = Pattern.compile(regularExpression);
}


public class kusername2 {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}