package google;
class UserDefinedEx extends Exception{
    UserDefinedEx(String s)
    {
        super(s);
    }
}
public class ExceptionUserDefinedEx2 {
    public static void main(String[] args) {
        try{
            
            throw new UserDefinedEx("\n\n\n\n\nUser Defined Exception.\n\n\n\n");
        }
        catch(UserDefinedEx e)
        {
            System.out.println(e);
        }
    }
}
