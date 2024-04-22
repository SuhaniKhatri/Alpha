package strings;

public class SubString {
    public static String getSubString(String str, int si, int ei) {
        String substr = "";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }

        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(getSubString(str, 3, 5));

        //inbuild method substring
        System.out.println(str.substring(0, 5));
    }
}
