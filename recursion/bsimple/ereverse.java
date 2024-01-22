package recursion.bsimple;

public class ereverse {
     public static void main(String[] args) {
        System.out.println(revdigits(12345));
    }

    private static int revdigits(int n) {
        if(n==0){
            return 0;
        }
        return revdigits(n/10) +10 *  n%10;
    }
}
