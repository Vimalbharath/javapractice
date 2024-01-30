package recursion.fstring;

import java.util.ArrayList;

public class lphonepadlc {
    public static void main(String[] args) {
        System.out.println(permutation("","23"));
    }

    private static ArrayList<String> permutation(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit=up.charAt(0)-'0';
        int j=(digit-2)*3;
        int len=j+3;
        if(digit>7){
            j=j+1;
        }
        if(digit==7 ||digit==9 ){
            len=len+1;
        }

        

        
        for(int i=j;i<len;i++){
            char ch=(char)('a'+i);
            ans.addAll(permutation(p+ch,up.substring(1)));
        }
        return ans;
    }
}
