// public class ParentMethods
 class ParentMethods
{
    public long method(String s)
    {
        System.out.println("Hello 1 with String");
        return 100;
    }
}
 
public class MethodOverloading extends ParentMethods{
    // public int method(String s,int a)
    public long method(String s)
    {
        System.out.println("Hello 2 with int");
        return 10l;
    }
    public static void main(String[] args) {

        
    }
    
}
