package hackerrank.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class hIPpattern{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    String pattern = "(((25[0-5])|(2[0-4]\\d)|([0-1]?\\d{1,2}))(\\.|$)){4}";
}