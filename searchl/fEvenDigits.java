package searchl;

import java.util.Arrays;

class fEvenDigits {
    public static void main(String[] args) {
        int[] arr={121,21,2213,4,5};
    System.out.println(Arrays.toString(arr));
    int a=findNumbers(arr);
    System.out.println(a);
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(iseven(nums[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean iseven(int num){
        if (digits(num)%2==0){
            return true;
        }
        return false;
    }
    public static int digits(int num){
        int a=(int)Math.log10(num);
        return (int)Math.log10(num)-1;
        
    }
}
