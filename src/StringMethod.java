import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args){
        String str1 = "abcdefg";
        String str2 = "bcdqtfe13";

        System.out.println(str1.equals(str2));
        System.out.println(str1.charAt(0));
        System.out.println(str1.length());
        System.out.println(str1.replace("a", "kkkkk"));
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2, 4));
        System.out.println(str1.indexOf("cde"));
        System.out.println(str1.contains("c"));
        System.out.println(Arrays.toString(str1.split("", 2)));
    }
}
