package google;
class Data100
{
    public Data100 show()
    {
        System.out.println("Hello this is with void...");
        return this;
    }

    public void display()
    {
        System.out.println("Display Data100");
    }
}

class Data101 extends Data100
{
    public Data101 show()
    {
        return this;
    }

    public void display1()
    {
        System.out.println("Display Data101");
    }
}
public class ConavrientEx {
    public static void main(String[] args) {
        Data100 o1 = new Data100();
        o1.display();
        o1.show();
        Data101 o2 = new Data101();
        o2.show();
        o2.display();
        o2.display1();
    }
    
}
