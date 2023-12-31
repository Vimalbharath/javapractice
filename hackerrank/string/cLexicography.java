package hackerrank.string;

import java.util.Scanner;

public class cLexicography {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        int y = s.length();
    int z = y - (k-1);

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'

int i = 0;

while ( i < z)
{
    String x1 = s.substring(i,i+k);

        if (smallest.compareTo(x1) > 0 )
        {
            smallest = x1;
        }            

        if (largest.compareTo(x1) < 0)
        {
            largest = x1;
        }
    i = i +1;
}
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}