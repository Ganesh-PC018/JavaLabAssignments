package google;
public class Logarithm {
    public static void main(String[] args) {
        double x = 10; // Example number
        
        double result = myLog(x);
        System.out.println("Natural logarithm of " + x + " is: " + result);
    }
    
    public static double myLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Input must be positive");
        }
        
        int terms = 50; // Number of terms in the Taylor series
        double result = 0;
        double numerator = x - 1;
        
        for (int n = 1; n <= terms; n++) {
            if (n % 2 == 0) {
                result -= Math.pow(numerator, n) / n;
            } else {
                result += Math.pow(numerator, n) / n;
            }
        }
        
        return result;
    }
}
