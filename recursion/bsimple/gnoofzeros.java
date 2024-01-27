package recursion.bsimple;

public class gnoofzeros {
    public static void main(String[] args) {
        System.out.println(zeros(1234000321));
    }

    private static int zeros(int n) {

        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n%10==n){
            return c;
        }
        if(n%10==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
