package google;
import java.util.*;
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> tl = new TreeSet<String>();
        tl.add("Ganesh");
        tl.add("Rustum");
        tl.add("Mane");
        tl.add("First");
        tl.add("patil");
        tl.add("all");
        Iterator<String> l = tl.iterator();
        while(l.hasNext())
        {
            System.out.println(l.next());

        }


    }
}
