package recursion.fstring;

public class csubseq {
    public static void main(String[] args) {
        subseq("","abc");
    }

    private static void subseq(String p,String up) {
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
        
    }
}
