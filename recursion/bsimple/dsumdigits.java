package recursion.bsimple;

public class dsumdigits {
     public static void main(String[] args) {
        System.out.println(sumdigits(5562245));
    }

    private static int sumdigits(int n) {
        if(n==0){
            return 0;
        }
        return n%10+sumdigits(n/10);
    }

}
