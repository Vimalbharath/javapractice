package searchl;

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(iseven(num)){
                count++;
            }
        }
        return count;
    }
    public boolean iseven(int num){
        if (digit(num)%2==0){
            return true;
        }
        return false;
    }
    public int digits(int num){
        return Math.log10(num);
    }
}
