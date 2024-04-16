import java.util.*;
public class Exception3April {

    public long runTimeArithmeticException(long num1,long num2)
    {
        long num=0;
        Scanner sc = new Scanner(System.in);
        try
        {
            num = num1/num2;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can not Divide by Zero");
            boolean isHandle = false;
            while(!isHandle)
            {
                try
                {
                        System.out.print("Enter Denominator again :  ");
                        num2  = sc.nextLong();
                        num = num1/num2;
                        isHandle = true;
                }
                catch(ArithmeticException e1)
                {
                    System.out.println("Can Not Divide by Zero");
                }
            }
        
        }
        return num;
    }

    public long runtimeNumberFormatException(String array[])
    {
        long sum=0l;
        try
        {
            for (String string : array) {
                long data = Long.parseLong(string);
                sum += data;
            }

        }
        catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception : Incompitable Datatype");
        }
        return sum;
    }
    public void compileTimeInterruptedException(int []array)
    {
        int sum=0;
        try
        {
            for (int i : array) {
                sum += i;
                System.out.println(sum);
                Thread.sleep(1000);
                System.out.println("Sleeping....!");
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted Exception");
        }

    }

    public int runTimeArrayIndexOutOfBounds(int array[])
    {
        int sum=-1;
        try{
            for (int i=0;i<array.length;i++) {
                // System.out.println(array[i]);
                sum += array[i];
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out of Bounds");
        }

        return sum;
    }
    // Exception3April obj = new Exception3April();
    public static void main(String[] args) {
        Exception3April exceptionObj = new Exception3April();
        // try
        // {
        // }
        // catch(StackOverflowError e)
        // {
        //     System.out.println("Stack OverFlow Error..");
        // }
        exceptionObj.compileTimeInterruptedException(new int[]{10,20,30,40,50});
        System.out.println(exceptionObj.runTimeArrayIndexOutOfBounds(new int[]{10,20,30}));
        System.out.println(exceptionObj.runTimeArithmeticException(10, 0));
        System.out.println(exceptionObj.runtimeNumberFormatException(new String[]{"10","20","Pushkar"}));
        try
        {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
        catch(Exception e)
        {
            System.out.println("Exception Occurred");
        }
    System.out.println("Rest");
    String s = "Hello";
    try
    {
         System.out.println(s.repeat(1000000000));
    }
    catch(OutOfMemoryError e)
    {
        System.out.println("Out Of Memory Error...!!");
        Scanner sc = new Scanner(System.in);
        boolean isHandle = false;
        while(!isHandle)
        {
        try
        {
            System.out.print("Enter The Valid Number of Count : ");
            int count = sc.nextInt();
            System.out.println(s.repeat(count));
            System.out.println(s);
            isHandle = true;
        }
        catch(OutOfMemoryError e1)
        {
            System.out.println("Out of Memory....");
        }
        }
    }        
    // s = s+"How";
    // System.out.println(s);
    System.out.println("Rest");
    }
}
