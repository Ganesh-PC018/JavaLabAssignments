package google;
import java.util.*;
public class CollectionVectorEx {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Milk");
        v.add("eggs");
        v.add("banana");
        v.add("Upma");
        v.add("Pohe");
        System.out.println("list  Vector : "+v);
        System.out.println("Size : "+v.size());
        System.out.println("get first : "+v.getFirst());
        System.out.println("get       : "+v.get(2));
        v.addFirst("Fried Rice.");
        System.out.println(v.remove(1));
        Iterator<String> vl = v.iterator();
        while(vl.hasNext())
        {
            System.out.println(vl.next());
        }
    }
}
