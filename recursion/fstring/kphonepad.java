package recursion.fstring;

import java.util.ArrayList;

public class kphonepad {
    public static void main(String[] args) {
        System.out.println(permutation("","12"));
    }

    private static ArrayList<String> permutation(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit=up.charAt(0)-'0';

        
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(permutation(p+ch,up.substring(1)));
        }
        return ans;
    }
}
