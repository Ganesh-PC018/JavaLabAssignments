package google;

import java.util.regex.Pattern;

public class RegexEx2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[amn]","a"));
        System.out.println(Pattern.matches("[abc]","bd"));
        System.out.println(Pattern.compile("^[abc]").matcher("def").matches());
        System.out.println(Pattern.matches("^[abc]","abcdefsh"));
        System.out.println(Pattern.matches("[A-L]","Abcdefghijk"));
        System.out.println(Pattern.matches("[A-L]","G"));
        System.out.println(Pattern.compile("[^abc]").matcher("abcd").find());
        System.out.println(Pattern.compile("[a-z&&[^bc]]").matcher("abedfrgh").find());
        System.out.println(Pattern.compile("[a-z&&[^ab]]").matcher("c").matches());


    }
}
