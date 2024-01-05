package search;

public class aArmstrong {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            if(isArmstrong(i)){        System.out.println(i);}
        }
    }
    public static boolean isArmstrong(int num){
        int original= num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            sum=sum+(rem*rem*rem);
            if (sum==original) {
                return true;
            }
          
        }
        return false;
    }
}
