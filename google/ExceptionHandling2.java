package google;
// import java.util.*;
public class ExceptionHandling2 {
    public static void main(String[] args) {
        // String s=null;
        // String s1 = "abc";
        try{
         //    System.out.println(100/0)
         //When do not write Code Below Exception Because when Exception Caught Try will not Execute ramaining Code
         //    System.out.println(s.length());
         //    int i = Integer.parseInt(s1);
         int arr[] = new int[]{10,20,30};
         System.out.println(arr[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Exception caught.");
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
            System.out.println("NUll pointer Exception");
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
            System.out.println("Number Format Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.err.println("Here is Error Found");
        }
        catch(Exception e)
        {
            System.out.println("if Above Not Throws Exception this will");
        }
        System.out.println("Rest of Code");
        System.out.println("is also executed");
    }
}
