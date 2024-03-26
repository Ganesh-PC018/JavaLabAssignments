package google;

import java.util.*;

public class CollectionTreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> d = new TreeSet<String>();
        d.add("Manish");
        d.add("Pavan");
        d.add("Pankaj");
        d.add("Pruthvi");
        d.add("Shubham");
        d.add("Ganesh");
        System.out.println(d);
        Iterator<String> l = d.iterator();
        while(l.hasNext())
        {
            System.out.println(l.next());
        }

    }
}
