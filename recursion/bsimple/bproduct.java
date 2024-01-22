package recursion.bsimple;

public class bproduct {
     public static void main(String[] args) {
        System.out.println(product(5,1));
    }

    private static int product(int n,int result) {
        int ans=result;
        if(n==0){
           System.out.println(ans);
            return ans;
        }
        result=ans*n;
        product(n-1,result);
        return result;
    }
}
