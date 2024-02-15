package google;

import java.util.*;
// import java.util.Collection;
// import java.util.Comparator;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ganesh");
        list.add("Mane");
        list.add("pruthvi");
        list.add("Pavan");
        list.add("Shubham");
        list.add("Pankaj");
        int a = list.size();
        System.out.println("Size of list : "+a);
        System.out.println(list.get(1));
        String b  = list.remove(1);
        System.out.println("remove Elememnt at 1 : "+b);
        list.add(2,"pratik");
        System.out.println(list);
        // ArrayList<String> list2 = (ArrayList<String>)list.clone();
        // list2.add("Abhang");
        // System.out.println(list2);
        // list2.clear();
        // System.out.println(list2);
        System.out.println(list.contains("pratik"));
        // Collections.sort(list,Comparator.comparing(list->list.name));

        java.util.Iterator<String> t = list.iterator();
        while(t.hasNext())
        {
            System.out.println(t.next());
        }

        for(String s : list)
        {
            System.out.println(s);
        }

        Collections.sort(list);
        for(String s : list)
        {
            System.out.print(s+" ");
        }
    }
}
