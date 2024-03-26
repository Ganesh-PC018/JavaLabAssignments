package google;

import java.util.*;
import java.util.Map.Entry;

class StudentDataSGGS
{
     String BookName,writer;
     int sr;
   public StudentDataSGGS(String BookName,String writer,int sr)
    {
        this.BookName  = BookName;
        this.writer    = writer;
        this.sr        = sr;
    }

    
}
public class CollectionLinkedHashMapEx {
    public static void main(String[] args) 
    {
        StudentDataSGGS s1 = new StudentDataSGGS("Operating System", "Peter Galvin", 501);
        StudentDataSGGS s2 = new StudentDataSGGS("Data Coommunication Networking", "Frouzen", 505);
        StudentDataSGGS s3 = new StudentDataSGGS("Complete Java Reference ","Hardly", 506);
        LinkedHashMap<Integer,StudentDataSGGS> l = new LinkedHashMap<Integer,StudentDataSGGS>();
        l.put(1,s1);
        l.put(2,s2);
        l.put(3,s3);
        for(Entry<Integer,StudentDataSGGS> m : l.entrySet())
        {
            int key = m.getKey();
            StudentDataSGGS value = m.getValue();

            System.out.println(key+"Details");
            System.out.println(value.sr+"  "+value.BookName+"  "+ value.writer);
        }
    
    }
}
