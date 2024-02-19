package google;

public class ExceptionNestedEx {
    public static void main(String[] args) {
        String s = "sggs";
        int i = 0;
        try
        {
            try{
                i = Integer.parseInt(s);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Number Format Exception : EROR");
            }

            try{
                int arr[] = new int[]{10,20,30,50};
                System.out.println(arr[10]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array Index out Of Bounds Exception.");
            }
        }
        catch(Exception e)
        {
            System.out.println("Here is Most Genenal Exception the Flow always from most Specific to Most general.");
        }
        finally
        {
            s = "123";
            i = Integer.valueOf(s);
            System.out.println(i);
            i = Integer.parseInt(s);
            System.out.println(i);
            System.out.println("Here is Finally Block");
        }
    }
}
