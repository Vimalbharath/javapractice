package recursion.fstring;

public class gpermutation {
    public static void main(String[] args) {
        permutation("","abc");
    }

    private static void permutation(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<p.length();i++){
            permutation(p.substring(i, i), up);
        }
    }
}
