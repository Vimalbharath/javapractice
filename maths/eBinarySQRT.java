package maths;

public class eBinarySQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.printf("%.3f", sqrt(n, p));
    }

    private static double sqrt(int n, int p) {
        int s=0;
        int e=n;
        double root=0.0;

        while(s<=e){
            int m=s+(e-s)/2;

            if(m*m==e){
                return m;
            }
            else if(m*m>n){
                e=m-1;
            }else{
                s=m+1;
                root=m;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            //while debugging vimal observed here using linear search
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr = incr/10;
        }
      return root;  
    }
}
