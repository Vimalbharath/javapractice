import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hEOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        String str= scan.nextLine();
        int i=1;
        while (scan.hasNext()){
            System.out.println(i+" "+str);
        }
        i++;
    }
}