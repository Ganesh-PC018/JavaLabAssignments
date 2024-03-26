package google;

import java.util.HashSet;

public class CollectionHashSet
{
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        name.add("One");
        name.add("Two");
        name.add("Three");
        name.add("Four");
        name.add("Five");
        java.util.Iterator<String> l = name.iterator();
        while(l.hasNext())
        {
            System.out.println(l.next());
        }
    }
}