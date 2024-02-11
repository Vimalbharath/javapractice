package linkedlist;

public class khappy {
    public static boolean isHappy(int n) {
        int f=n;
        int s=n;

        do{
        f=sum(f);
        s=sum(sum(s));
        if(f==1){
            return true;
        }
        }while(f!=s);
    return false;
    }
    public static int sum(int n){
        int ans=0;
        while(n>0){
            int a=n%10;
            ans=ans+(a*a);
            n=n/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
