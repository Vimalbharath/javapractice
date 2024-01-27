package recursion.bsimple;

public class fpalindrome {
     public static void main(String[] args) {
        System.out.println(palindrome(1234321));
    }
    private static boolean palindrome(int n) {
        return (n==revdigits2(n));
    }
    private static int revdigits2(int n) {
        int noofdigits=(int) Math.log10(n)+1;
        return helper(n,noofdigits);
    }
    private static int helper(int n, int noofdigits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10, noofdigits-1)+helper(n/10,noofdigits-1);
    }
}
