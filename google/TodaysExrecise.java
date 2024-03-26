package google;
public class TodaysExrecise {
    public void func()
    {
        byte b = 13; // Primitive
        System.out.println("byte : "+ b);
        System.out.println("This is primitive data type");
        Byte b1 = 15;//Class Wrapper 
        int i = 10;
        Integer i1 = 13;
        System.out.println(i);
        System.out.println(i1);
        System.out.println("Byte : "+b1);
        System.out.println("This is Wrapper Class Converts Primitive to Object..");
    } 
    public static void main(String[] args)
    {
        TodaysExrecise o1 = new TodaysExrecise();
        o1.func();

        byte a  = 13;
        a = (byte)(a + 124);
        System.out.println("A : "+a);
    }
}
