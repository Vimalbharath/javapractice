package search;

public class bPrime {
    public static void main(String[] args) {
        
    
    for(int i=0;i<1000;i++){
            if(isPrime(i)){        System.out.println(i);}
        }
    }
    public static boolean isPrime(int num){
        int c=2;
        while(c*c<=num){
            if(num%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
