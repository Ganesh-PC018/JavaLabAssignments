package google;
import java.util.*;
public class StringAnagramOrNot {
    public static boolean isAnagram(String s1,String s2)
    {
        // boolean status = false;
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");
       
        if(s1.length() != s2.length())
        {
            return false;
        }
        else
        {
            char arr1[] = s1.toLowerCase().toCharArray();
            char arr2[] = s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    } 
    public static void main(String[] args) {
        if(isAnagram("Peek","keeP"))
        {
            System.out.println("The Given string are anagram");
        }
        else
        {
            System.out.println("The Given string are not anagram");
        }
    }
}
