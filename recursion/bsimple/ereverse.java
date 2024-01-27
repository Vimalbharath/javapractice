package recursion.bsimple;

public class ereverse {
     public static void main(String[] args) {
        System.out.println(revdigits2(12345));
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
    static int sum=0;

    private static int revdigits1(int n) {
        if(n==0){
            return sum;
        }
        sum=sum*10+n%10;
        return revdigits1(n/10) ;
    }
}
