package google;

// import java.util.HashMap;
import java.util.*;

// import javax.swing.plaf.synth.SynthSplitPaneUI;

public class CollectionHashMapEx {
    public static void main(String[] args) {
        Map<Integer,Integer> l = new HashMap<Integer,Integer>();
        l.put(1,100 );
        l.put(2,200);
        l.put(3,300);
        l.put(4,400);
        l.put(5,500);
        for(Map.Entry<Integer,Integer> m  : l.entrySet())
        {
            // System.out.println(m);
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }
}
