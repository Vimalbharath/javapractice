package recursion.gbacktrack;

public class epathRestriction {
    public static void main(String[] args) {
        boolean [][] board={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        pathRestriction("",board,3,3);
    }

    private static void pathRestriction(String p,boolean [][] board,int r, int c) {
       if(r==board.length-1 && c==board[0].length-1){
            System.out.println(p);
            return ;
       }
       if(!board[r][c]){
        return;
       }
       
       if(r<board.length-1){
        pathRestriction(p+'D',board,r+1,c);
       }
       if(c<board[0].length-1){
        pathRestriction(p+'R',board,r,c+1);
       }
      
    }
}
