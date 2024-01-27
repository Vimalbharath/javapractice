package recursion.bsimple;

public class ereverse {
     public static void main(String[] args) {
        System.out.println(revdigits1(12345));
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
