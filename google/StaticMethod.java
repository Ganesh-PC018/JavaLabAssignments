package google;
class Student2
{
    static String name = "GPP";
    Student2()
    {
        System.out.println("College : "+name);
    }
    static void change()
    {
        name =  "Sggs";
        System.out.println("Name : "+name);
    }


}

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("Static Method");
        // Student2 s1 = new Student2();
        Student2.change();

    }
}
