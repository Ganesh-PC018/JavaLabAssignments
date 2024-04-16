public class ConstructorClass {
    ConstructorClass(int a,int b)
    {
        System.out.println("int int");
    }
    // ConstructorClass(int a,long b)
    // {
    //     System.out.println("int Long");
    // }
    // ConstructorClass(long a,int b)
    // {
    //     System.out.println("long int");
    // }
    public void method(String s)
    {
        System.out.println("Hello");
    }

   
    public static void main(String[] args) {
        ConstructorClass obj = new ConstructorClass(10,20);

    }
}
