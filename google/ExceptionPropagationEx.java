package google;
class ExPropagation extends Exception
{
    void m()
    {
        //Unchecked Exceptions
        System.err.println(50/0);
    }
    void n()
    {
        m();
    }

    void p()
    {
        try
        {
            n();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception : Divide by Zero.");
        }
    }
}
public class ExceptionPropagationEx {
    public static void main(String[] args) 
    {
        ExPropagation o = new ExPropagation();
        o.p();
    }
}
