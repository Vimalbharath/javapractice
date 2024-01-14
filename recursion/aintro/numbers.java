package recursion.aintro;

public class numbers {
    public static void main(String[] args) {
        print(5);
    }

    private static void print(int n) {
        if(n==5){
            System.out.println(n);
        }
        System.out.println(1);
        print(n+1);
    }
}
