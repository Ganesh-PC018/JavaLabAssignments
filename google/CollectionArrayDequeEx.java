package google;
import java.util.*;
public class CollectionArrayDequeEx {
    public static void main(String[] args) {
        Deque<String> l = new ArrayDeque<String>();
        l.add("Ganesh");
        l.add("Mane");
        l.add("Tu");
        l.add("hai");
        l.add("wahi");
        l.add("dil");
        l.add("ne");
        l.add("jisse");
        l.add("chaha");
        Iterator<String> l1 = l.descendingIterator();
        while(l1.hasNext())
        {
            System.out.println(l1.next());
        }
    }
}
