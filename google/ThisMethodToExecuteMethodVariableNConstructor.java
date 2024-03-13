package google;
class A
{
    int a;
    A()
    {
        System.out.println("Value of A : "+a);
    }
    A(int a)
    {
        this();
        this.a = a;
    }
    void show()
    {
        System.out.println("Method call by this pointer");
        System.out.println("Now im going call constructor using this pointer");
    }

}
public class ThisMethodToExecuteMethodVariableNConstructor {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
