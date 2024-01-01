package hackerrank.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kUsername {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalUserName = sc.nextInt();

    String userNamePattern =  "^[A-Za-z][A-Za-z0-9_]{7,29}$";
    Pattern userPattern = Pattern.compile(userNamePattern);

    while(sc.hasNext()){
        String userName = sc.next();
        if(userName.equals("exit")){
            break;
        }
        Matcher validUserName = userPattern.matcher(userName);
        if(validUserName.matches()){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
}
