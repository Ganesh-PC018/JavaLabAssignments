package google;
import java.util.*;
public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<String> ls = new LinkedHashSet<String>();
        ls.add("Hello");
        ls.add(null);
        ls.add("ganesh");
        Iterator<String> l = ls.iterator();
        while(l.hasNext())
        {
            System.out.println(l.next());
        }
    }
}
