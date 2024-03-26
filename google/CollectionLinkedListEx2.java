package google;
import java.util.*;
public class CollectionLinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<String>  ll= new LinkedList<String>();
        ll.add("Focus");
        ll.add("consistency");
        ll.add("discipline");
        ll.add("Orderly");
        ll.add("Peace");

        System.out.println("Size : "+ll.size());
        for(String a : ll)
        {
            System.out.println(a);
        }
        for(int i=0;i<ll.size();i++)
        {
            System.out.print(ll.get(i)+" ");
        }
        System.out.println();
        Iterator<String> print = ll.iterator();
        while(print.hasNext())
        {
            System.out.print(print.next()+"  ");
        }
        System.out.println();
        print = ll.descendingIterator();
        while(print.hasNext())
        {
            System.out.print(print.next()+" ");
        }
        System.out.println();
        ((LinkedList<String>)ll).forEach(a->{System.out.println(a);});

    }
}
