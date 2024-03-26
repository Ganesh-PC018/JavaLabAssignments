package google;
import java.util.*;
public class StringTokenizerClass {
    public static void main(String[] args) {
        StringTokenizer token = new StringTokenizer("Hello i am a enthusiast Java Developer.");
        while(token.hasMoreTokens())
        {
            System.out.println(token.nextToken());
            
        }
        StringTokenizer t1 = new StringTokenizer("Hey How are You.");
        System.out.println("Token Count : "+t1.countTokens());

    }
}
