package recursion.gbacktrack;

import java.util.Arrays;

public class gallPathPrint {
    public static void main(String[] args) {
        boolean [][] board={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("",board,0,0,path,1);
    }

    private static void allPathPrint(String p,boolean [][] board,int r, int c,int[][] path,int step) {
       if(r==board.length-1 && c==board[0].length-1){
        for(int[] col:path){
            System.out.println(Arrays.toString(col));
        }
            System.out.println(p);
            System.out.println();
            return ;
       }
       if(!board[r][c]){
        return;
       }

       board[r][c]=false;
       if(r<board.length-1){
        allPathPrint(p+'D',board,r+1,c,path,step+1);
       }
       if(c<board[0].length-1){
        allPathPrint(p+'R',board,r,c+1,path,step+1);
       }
       if(r>0){
        allPathPrint(p+'U',board,r-1,c,path,step+1);
       }
       if(c>0){
        allPathPrint(p+'L',board,r,c-1,path,step+1);
       }
      board[r][c]=true;
      path[r][c]=0;
    }
}
