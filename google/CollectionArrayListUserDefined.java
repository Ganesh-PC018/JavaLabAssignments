package google;
import java.util.*;
public class CollectionArrayListUserDefined {
    public static void main(String[] args) {
        StudentData1 s1 = new StudentData1("Ganesh",501,19);
        StudentData1 s2 = new StudentData1("Pavan", 505,18);
        StudentData1 s3 = new StudentData1("Shubham",506,19);
        ArrayList<StudentData1> o1 = new ArrayList<StudentData1>();
        o1.add(s1);
        o1.add(s2);
        o1.add(s3);
        o1.add(new StudentData1("Rohit",503,21));
        for(Object a : o1)
        {
           StudentData1 st = (StudentData1)a;
            System.out.println(st.name+" "+st.enroll+" "+st.age);
        }
        Iterator<StudentData1> data = o1.iterator();
        while(data.hasNext())
        {
           StudentData1 s = (StudentData1)data.next();
           System.out.println(s.name+" "+s.enroll+" "+s.age);
        }

    }
    
}
