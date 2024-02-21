package google;

public class ExceptionTryFinally {
    public static void main(String[] args) {
        String s = null;

        try
        {
            // System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            System.err.println(e);;
            System.err.println("Null Pointer Exception occur.");
        }
        finally
        {
            System.out.println("This is Finally Method it will execute whatever the condition");
        }
        s= "Oh Noo";
        System.out.println(s);
    }
    
}
