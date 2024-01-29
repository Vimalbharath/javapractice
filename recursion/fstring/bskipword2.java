package recursion.fstring;

public class bskipword2 {
    public static void main(String[] args) {
        System.out.println(skipapple("abapplecdappcbg"));

    }

    private static String skipapple(String up) {
       if(up.isEmpty()){
       
        return"";
       }
       char ch=up.charAt(0);
       if(up.startsWith("app" )&& !up.startsWith("apple")){
        return skipapple(up.substring(3));
       }
       else{
        return ch+skipapple(up.substring(1));
       }
    }
}
