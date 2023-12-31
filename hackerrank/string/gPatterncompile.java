package hackerrank.string;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class gPatterncompile {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            
            try{
                Pattern words = Pattern.compile(pattern);
                System.out.println("Valid");    
            }catch(PatternSyntaxException exception){
                System.out.println("Invalid");
            }
            testCases--;
              
		}
	}
}
