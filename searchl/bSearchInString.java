package searchl;

public class bSearchInString {
    public static void main(String[] args) {
        String name="Vimalbharath";
        char letter ='a';
        boolean B= searchLetter1(name,letter);
        System.out.println(B);
    }

    private static boolean searchLetter1(String name, char letter) {
        for (int i = 0; i < name.length(); i++) {
            if (letter == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean searchLetter(String name, char letter) {
        char[]arr= name.toCharArray();
        for(char i:name.toCharArray() ){
            if (i==letter){
                return true;
            }
        }
        return false;
    }
}
