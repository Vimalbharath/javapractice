package recursion.gbacktrack;

public class acountpath {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }

    private static int count(int r, int c) {
       if(r==1 && c==1){
            return 1;
       }
       int ans=0;
       if(r>1){
        ans=ans+count(r-1,c);
       }
       if(c>1){
        ans=ans+count(r,c-1);
       }
       return ans;
    }
}
