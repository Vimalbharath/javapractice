package recursion.bsimple;

public class bproduct {
     public static void main(String[] args) {
        product(5);
    }

    private static void product(int n) {
        int ans=1;
        if(n==0){
            System.out.println(ans);
            return ;
        }
        ans=ans*n;
        product(n-1);
    }
}
