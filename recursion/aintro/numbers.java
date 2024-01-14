package recursion.aintro;

public class numbers {
    public static void main(String[] args) {
        print(1);
    }

    private static void print(int n) {
        if(n==5){
            System.out.println(n);
        }
        System.out.println(n);
        print(n+1);
    }
}
