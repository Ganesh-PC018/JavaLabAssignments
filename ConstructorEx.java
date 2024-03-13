public class ConstructorEx {
    public ConstructorEx()
    {
        System.out.println("This Default : "+this);
        // System.out.println("This is Default Constructor.");
        new ConstructorEx(10);
    }
    
    public ConstructorEx(int data)
    {
        this(10,20);
        // System.out.println("This is Parameterized Constructor with Value : "+data);
        System.out.println("this int: "+this);
    }

    public ConstructorEx(int data1,int data2)
    {
        // this();
        System.out.println("This int int : "+this);
        // System.out.println("this is also a Constructor but Called Using New Keyword");
        System.out.println(ConstructorEx(data1,data2));
    }
    public int ConstructorEx(int n1,int n2)
    {
        return n1+n2;
    }
    public static void main(String[] args) {
        new ConstructorEx();
    }
}
