package hackerrank.string;

import java.util.Scanner;

public class eAnagram {
 static boolean isAnagram(String a, String b) {
        // Complete the function
         if(a.length() != b.length()){
            return false;
        }
        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(arrA);
        java.util.Arrays.sort(arrB);
        return java.util.Arrays.equals(arrA, arrB);
    }

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}