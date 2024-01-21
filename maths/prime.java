package maths;

public class prime {
    public static void main(String[] args) {
        for(int i=2;i<=40;i++){
            System.out.println(i +" "+ isPrime(i));
        //     System.out.print(isPrime(i));
         }
    }
    public static String isPrime(int n){
        int c=2;
        while(c*c<=n){
        if(n%c==0){
            return "is not prime";
        }
        c++;
    }
        return "is prime";
    }
}
