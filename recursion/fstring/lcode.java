package recursion.fstring;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        
        String p="";
        ArrayList<String>list=new ArrayList<>();
          if (digits == null || digits.length() == 0) {
            return new ArrayList();
        }

     list=  pad(p,digits);
     return list;
        
    }
     public static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);

            return list;
        }
        int digit = up.charAt(0) - '0';
        
        ArrayList<String>ans=new ArrayList<>();
        if(digit<=6)
        {
        for (int i =( (digit - 2) * 3); i < ((digit-1) * 3); i++) {

            char ch = (char) ('a' + i);
           ans.addAll( pad(p + ch, up.substring(1)));
        }
        }
        if(digit==7)
        {
             for (int i =( (digit - 2) * 3); i <=((digit-1) * 3); i++) {

            char ch = (char) ('a' + i);
           ans.addAll( pad(p + ch, up.substring(1)));
        }
        }
        if(digit==8)
        {
            for (int i =( (digit - 2) * 3)+1; i <=((digit-1) * 3); i++) {

            char ch = (char) ('a' + i);
           ans.addAll( pad(p + ch, up.substring(1)));
        }
        }
        if(digit==9)
        {
             for (int i =( (digit - 2) * 3)+1; i <=((digit-1) * 3)+1; i++) {

            char ch = (char) ('a' + i);
           ans.addAll( pad(p + ch, up.substring(1)));
             }

        

        }

        
       
        return ans;


          
     } 
}
 
     

