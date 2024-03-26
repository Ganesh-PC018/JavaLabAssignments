package google;
import java.util.*;
public class CollectionVectorStackEx {

    // public static void print(int arr[])
    // {
    //     for(int a : arr)
    //     {
    //         System.out.println(a);
    //     }
    // }
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.push("MPI");
        s.push("Java");
        s.push("M4");
        // print(new int[]{10,20,30});
        s.push("Soft Skill");
        s.add("CL-II");
        s.add("HVPE");
        System.out.println(s);
        s.addLast("SS");
        s.removeLast();
        Iterator<String> l = s.iterator();
        while(l.hasNext())
        {
            System.out.println(l.next());
        }
    }
}
