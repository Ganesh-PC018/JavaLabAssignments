package google;

import google.OuterEx3.InnerStaticClass;

class OuterEx3
{
    static class InnerStaticClass
    {
        static void show()
        {
            System.out.println("This is Show method inside static class.");
        }
        void display()
        {
            System.out.println("This is display method but not static");
        }
    }
}
public class InnerStaticEx {
    public static void main(String[] args) 
    {
        OuterEx3.InnerStaticClass.show();
        OuterEx3.InnerStaticClass obj = new OuterEx3.InnerStaticClass();
        obj.display();
    }
}
