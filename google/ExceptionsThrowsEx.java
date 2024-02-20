package google;

import java.io.IOException;

class ExceptionEx
{
    void o() throws IOException
    {
        throw new IOException("Device Not Found");
    }
    void n() throws IOException
    {
        o();
    }
    void m()
    {
        try
        {
            n();
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled...");
        }
    }
}
public class ExceptionsThrowsEx {
    public static void main(String[] args) 
    {
        ExceptionEx obj = new ExceptionEx();
        obj.m();
        System.out.println("Normal Flow.......!!");
        
    }
}
