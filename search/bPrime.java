package search;

public class bPrime {
    public static void main(String[] args) {
        
    
    System.out.println(isPrime(7));
    }
    public static boolean isPrime(int num){
        int c=2;
        while(c*c<num){
            if(num%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
