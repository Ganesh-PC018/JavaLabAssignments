package google;
import java.lang.Exception;
class MyException extends Exception
{

   public MyException(String str)
    {
        super(str);
        System.out.println("Call Super Class.");
    }
}
public class UserDefinedException 
{
    public static void main(String[] args) {
        try
        {
            throw new MyException("This is Exception");
        }
        catch(MyException e)
        {
            System.out.println("This is Catch Method");
            System.out.println(e.getMessage());
        }
    }
}