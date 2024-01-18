package recursion.aintro;

public class bfibbo {
    public static void main(String[] args) {
       int num=fibbo(4);
       System.out.println(num);
    }

    private static int fibbo(int n) {
        if(n<2){
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    
}
