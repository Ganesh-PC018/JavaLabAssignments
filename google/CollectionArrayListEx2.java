package google;

import java.util.*;

public class CollectionArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(05);
        l.add(55);
        l.add(35);
        l.add(20);
        for(Integer a : l)
        {
            System.out.println(a);
        }
        Collections.sort(l);
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
        System.out.println();
        ListIterator<Integer> list =l.listIterator(l.size());//upcast
        while(list.hasPrevious())
        {
            System.out.println(list.previous());
        }

        ((ArrayList<Integer>)l).forEach(a->{ System.out.println("a : "+a);});
    }
}
