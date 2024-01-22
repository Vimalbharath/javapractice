package recursion.bsimple;

public class bproduct {
     public static void main(String[] args) {
      product(5,1);
    }

    private static void product(int n,int result) {
      //  int ans=result;
        if(n==0){
            // here printing the correct ans while return it print original
         System.out.println(result);
         return;

        }
        result=result*n;
        product(n-1,result);
        
    }
}
