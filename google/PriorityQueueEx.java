package google;
import java.util.*;
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> pl = new PriorityQueue<String>();
        pl.add("Ganesh");
        pl.add("Mane");
        pl.add("Priority");
        Iterator<String> l = pl.iterator();
        while(l.hasNext())
        {
            System.out.println(l.next());
        }

    }
}
