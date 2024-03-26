package google;
class Student21
{
    private String name;
    public Student21(String name)
    {
        this.name = name;
    }
    public void setData(String name)
    {
        this.name =name;
    } 
    public String getData()
    {
        return name;
    }
    public int length()
    {
        return name.length();
    }
}
public class CustomWrapperClass {
    public static void main(String[] args) {
        Student21 o1 = new Student21("Hello Java");
        System.out.println("original String : "+o1.getData());
        System.out.println("String Length : "+o1.length());
        o1.setData("Java is Awesome");
        System.out.println("New String : "+ o1.getData() );
        System.out.println("New String Length : "+o1.length());
    }
}
