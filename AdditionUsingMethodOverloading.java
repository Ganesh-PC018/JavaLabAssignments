
public class AdditionUsingMethodOverloading {
    public Object method1(AdditionUsingMethodOverloading o1)
    {
        return o1;
    }

    public AdditionUsingMethodOverloading method2(AdditionUsingMethodOverloading o2)
    {
        return o2;
    }

    // public int add(int a,int b)
    // {
    //     System.out.println(a+b);
    //     return 10;
    // }
   
    public int  AdditionUsingMethodOverloading()
    {
        return 10+20;
    }

    public long add(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        AdditionUsingMethodOverloading obj =new AdditionUsingMethodOverloading();
        // AdditionUsingMethodOverloading obj = new AdditionUsingMethodOverloading();
        obj.method2(obj);
        obj.method1(obj);
    }
}
