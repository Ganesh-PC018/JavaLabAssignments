package google;

// import java.util.LinkedList;
import java.util.*;
public class CollectionLinkedListE {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("Apple");
        l.add("banana");
        l.add("Grapes");
        l.add("Papaya");
        l.add("Orange");
        l.add("Mango");
        System.out.println(l);
        System.out.println("Size : "+l.size());
        System.out.println("is Contains Water-Melon  : "+l.contains("Watermelon"));
        System.out.println("Element : "+l.element());
        System.out.println("get element at index 2 : "+l.get(2));
        System.out.println("getFirst Element : "+l.getFirst());
        System.out.println("getLast : "+l.getLast());
        System.out.println("hasCode : "+l.hashCode());
        System.out.println("Index of : "+l.indexOf("banana"));
        System.out.println("Is Empty : "+l.isEmpty());
        l.addFirst("Custored Apple");
        System.out.println(l);
        Iterator<String> li = l.iterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }        
    }
}
