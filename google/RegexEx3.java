package google;

import java.util.regex.Pattern;

public class RegexEx3 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[amn]", "a"));
        System.out.println(Pattern.matches("[abc]", "aa"));
        System.out.println(Pattern.compile("[abc]?").matcher("b").matches());
        System.out.println(Pattern.matches("[abc]?","aaaabbbb"));
        System.out.println(Pattern.matches("[abc]+", "aaaaabbbcccc"));
        System.out.println(Pattern.matches("[abc]+","aabcd"));
        System.out.println(Pattern.matches("[abc]*","aaaabb"));
        System.out.println(Pattern.matches("[abc]*","bcd"));
        
    }
}
