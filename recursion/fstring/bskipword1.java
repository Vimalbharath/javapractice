package recursion.fstring;

public class bskipword1 {
    public static void main(String[] args) {
        System.out.println(skipapple("abapplecdbbcbg"));

    }

    private static String skipapple(String up) {
       if(up.isEmpty()){
       
        return"";
       }
       char ch=up.charAt(0);
       if(up.startsWith("apple")){
        return skipapple(up.substring(5));
       }
       else{
        return ch+skipapple(up.substring(1));
       }
    }
}
