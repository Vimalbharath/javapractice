package hackerrank;

import java.util.*;
import java.io.*;

class fEquation{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ans=a;
           
            for(int z=1;z<=n;z++){
                int p=(int)Math.pow(2,z-1);
                // int q=p*b;
                // int r=0;
                // r=r+q;
            ans=ans+p*b;
            System.out.printf(ans+" ");
            
            
            }
        }
       
        
         in.close();
    }
}