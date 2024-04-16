class DuckEx
{
    public void a() throws ArithmeticException
    {
        b();
    }

    public void b() throws ArithmeticException
    {
        int num1 = 10;
        int num2 = 0;
        int num = num1/num2;
    }
}
class DuckingExample 
{

    public static void main(String[] args) {
    DuckEx obj = new DuckEx();
    try
    {

        obj.a();
    }
    catch(ArithmeticException e)
    {
        System.out.println("Error : "+e.getMessage());
    }
    }
}
