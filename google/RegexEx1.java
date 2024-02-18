package google;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".s"); // Compile is Static method which takes extension
        Matcher m = p.matcher("gs");
        boolean b1 = m.matches();
        System.out.println(b1);
        boolean b2 = Pattern.compile("..s").matcher("was").matches();
        System.out.println(b2);
        boolean b3 = Pattern.matches(".java","ajava");
        System.out.println(b3);
    }
}
