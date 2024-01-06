package searchl;
//https://leetcode.com/problems/richest-customer-wealth/

public class gMaxWealth{
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int a=maximumWealth(accounts);
        System.out.println(a);

    }

    public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int rowsum=0;
            for(int j=0;j<accounts[i].length;j++){
                rowsum=rowsum+accounts[i][j];
            }
            if(rowsum>max){
                max=rowsum;
            }
        }
        return max;
    }
}