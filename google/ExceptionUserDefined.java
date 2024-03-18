package google;
class userDefinedExceptionEx extends Exception
{
        userDefinedExceptionEx(String s)
        {
            super(s);
        }
}
public class ExceptionUserDefined {
    public static void main(String[] args) {
        int age =17;
        if(age < 18)
        {
            try {
                throw new userDefinedExceptionEx("Age is Below 18 | You are Note ligible to Vote");
                } 
                catch (userDefinedExceptionEx e)
                {
               System.out.println(e);
                }
        }
    }
}
