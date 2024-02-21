package google;

public class ExceptionThrowEx {
    public static void main(String[] args) {
        int age =17;
        if(age < 18)
        {
            // System.out.println(100/0);
            throw new ArithmeticException("Throws the Exception : Divide by Zero || You are Eligible to Vote");
        }
        else
        {
            System.out.println("You are Elgible to Vote.");
        }
        System.out.println("Hello");
        System.out.println("Another Statement");
        System.out.println("This also be excute");
    }
}
