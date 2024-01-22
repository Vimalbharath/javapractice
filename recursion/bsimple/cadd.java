package recursion.bsimple;

public class cadd {
    public static void main(String[] args) {
        add(5,0);
    }

    private static void add(int n, int ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        ans=ans+n;
        add(n-1,ans);
    }
}
