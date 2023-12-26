package hackerrank;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int z=0;z<=n;z++){
                int ans=a;
            if (z==0){
                
                System.out.printf(ans+" ");
            }
            else
            {ans=ans+(2^z)*b;
            System.out.printf(ans+" ");
            }
            
            }
        }
       
        
         in.close();
    }
}