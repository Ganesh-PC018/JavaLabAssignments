package google;

import java.util.*;

public class CollectionPriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        System.out.println("Queue    : "+pq);
        System.out.println("Contains : "+pq.contains(50));
        System.out.println("HashCode : "+pq.hashCode());
        System.out.println(pq.offer(70));
        Object[] arr = pq.toArray();
        for(Object a : arr)
        {
            System.out.println(a);
        }
        Iterator<Integer> ol = pq.iterator();
        while(ol.hasNext())
        {
            System.out.println(ol.next());
        }

    }
}
