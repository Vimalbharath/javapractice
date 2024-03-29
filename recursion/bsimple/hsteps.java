package recursion.bsimple;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class hsteps {
     public static void main(String[] args) {
        System.out.println(numberOfSteps(1));
    }
     public static int numberOfSteps(int num) {
        return helper(num,0);
    }
    public static int helper(int num,int step){
        if(num==0){
            return step;
        }
        if(num%2==0){
            return helper(num/2,step+1);
        }
        else{
            return helper(num-1,step+1);
        }
    }
}
