package google;
import java.util.*;
public class CollectionDequeArrayWx {
    public static void main(String[] args) {
        Deque<Integer> o1 = new ArrayDeque<Integer>();
        o1.add(9);
        o1.add(3);
        o1.add(18);
        o1.addFirst(7);
        o1.add(8);
        o1.addLast(10);
        System.out.println("is Contains 8 : "+o1.contains(8));
        System.out.println(o1.getFirst());
        System.out.println(o1.getLast());
        System.out.println(o1.remove(7));
        System.out.println(o1.size());
        System.out.println(o1.hashCode());
        Iterator<Integer> l1= o1.iterator();
        while(l1.hasNext())
        {
            System.out.println(l1.next());
        }
    }
}
