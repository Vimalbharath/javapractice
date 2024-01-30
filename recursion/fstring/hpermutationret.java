package recursion.fstring;

import java.util.ArrayList;

public class hpermutationret {
    public static void main(String[] args) {
        permutationret("","abc");
    }

    private static ArrayList<String> permutationret(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            return (permutationret(f+ch+s,up.substring(1)));
        }
    }
}
