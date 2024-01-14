package pattern;

public class pattern {
    public static void main(String[] args) {
        int n=4;
        pattern12(n);
    }

    private static void pattern1(int n) {
        for(int i=1;i<=n;i++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern2(int n) {
        for(int i=1;i<=n;i++){
            for(int col=1;col<=i;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern3(int n) {
        for(int i=1;i<=n;i++){
            for(int z=1;z<=n-i;z++){
                System.out.print(" ");
            }
            for(int col=1;col<=i;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(int z=1;z<=n-i;z++){
                System.out.print(" ");
            }
            for(int col=1;col<=i;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    private static void pattern5(int n) {
        for(int i=1;i<=n;i++){
            for(int z=1;z<=n-i;z++){
                System.out.print(" ");
            }
            for(int col=1;col<=i;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    private static void pattern6(int n) {
        for(int i=1;i<=n;i++){
            for(int z=1;z<=n-i;z++){
                System.out.print(" ");
            }
            for(int col=1;col<=i;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern7(int n) {
        for(int i=1;i<2*n;i++){

            int newi=i<=n?i:2*n-i;
            // for(int z=1;z<=newn-i;z++){
            //     System.out.print(" ");
            // }
            for(int col=1;col<=newi;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern8(int n) {
        for(int i=1;i<2*n;i++){

            int newi=i<=n?i:2*n-i;
            for(int z=1;z<=n-newi;z++){
                System.out.print(" ");
            }
            for(int col=1;col<=newi;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     private static void pattern9(int n) {
        for(int i=1;i<2*n;i++){

            int newi=i<=n?i:2*n-i;
            for(int z=1;z<=n-newi;z++){
                System.out.print(" ");
            }
            for(int col=1;col<=newi;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    private static void pattern10(int n) {
        for(int i=1;i<=n;i++){

            //int newi=i<=n?i:2*n-i;
            for(int z=1;z<=n-i;z++){
                System.out.print("  ");
            }
            for(int col=i;col>0;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=i;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    private static void pattern11(int n) {
        for(int i=1;i<2*n;i++){

            int newi=i<=n?i:2*n-i;
            for(int z=1;z<=n-newi;z++){
                System.out.print("  ");
            }
            for(int col=newi;col>0;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=newi;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    private static void pattern12(int n) {
        int originaln=n;
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int col=0;col<=n;col++){
                System.out.print(originaln+1-Math.min(Math.min(i,col),Math.min(n-i,n-col))+" ");
            }
           
            System.out.println();
        }
    }
}
