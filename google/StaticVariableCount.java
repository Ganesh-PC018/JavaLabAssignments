package google;
class Student1
{
    String name;
    static int count;

    void setter(String name)
    {
        this.name = name;
    }
    void getter()
    {
        System.out.println("Name : "+name);
        System.out.println("Count : "+ (++count));
    }
    
}
public class StaticVariableCount {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        s1.setter("Ganesh Mane");
        s2.setter("Mane Ganesh");
        s1.getter();
        s2.getter();
        // Student10 o1 = new Student10();
        // o1.getData();

    }
}
