package google;
public class LogicalANDvsBitwiseAND {
    public static void main(String[] args) {
        int a =10;
        int b =5;

        boolean r1 = (a < b && b < a); // Logical && doesn't check another if First is False
        boolean r2 = (a < b & b < a); //bitwise & Check both Condition Wheather is True or False.
        System.out.println("R1 : "+(r1));
        System.out.println("R2 : "+(r2));
        boolean r3 = (a < b || b < a); // Logical || doesn't check another if First is False
        boolean r4 = (a < b | b < a); //bitwise | Check both Condition Wheather is True or False.
        System.out.println("R3 : "+(r3));
        System.out.println("R4 : "+(r4));
    }
}
