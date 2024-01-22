package recursion.bsimple;

public class bproduct {
     public static void main(String[] args) {
        System.out.println(product(5));
    }

    private static int product(int n) {
        int ans=n;
        if(n==0){
            System.out.println(ans);
            return ans;
        }
        ans=ans*n;
        product(n-1);
        return ans;
    }
}
