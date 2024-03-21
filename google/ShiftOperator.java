package google;
public class ShiftOperator {
    public static void main(String[] args) {
        int a=10;
        // int b=20;
        System.out.println("a<<2 Left Shift a*2^2   : "+(a<<2)); //10*2^2=10*4=40
        System.out.println("a<<3 Left Shift a*2^3   : "+(a<<3)); //10*2^3 = 10*8 = 80
        System.out.println("a<<3 Left Shift a*2^4   : "+(a<<4)); //10*2^4 = 10*16 = 160
        System.out.println("a>>3 Right Shift a*2^3   : "+(a>>3)); //10/2^3 = 10/8 = 1
        System.out.println("a>>4 Right Shift a*2^3   : "+(a>>4)); //10/2^4 = 10/16 = 0
    }
}
