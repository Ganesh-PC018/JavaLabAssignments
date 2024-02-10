package google;

public class Factorial {
    public static int factorialEx(int data)
    {
        if(data == 0 || data == 1)
        {
            return 1;
        }
        return data*factorialEx(data-1);
    }

    public static void main(String[] args) {
        System.out.println( Factorial.factorialEx(5));
    }
}
