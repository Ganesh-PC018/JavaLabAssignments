package google;

public class MathEx {
    public static void main(String[] args) {
        int a =10;
        int b =2;
         int c = -1090;
        System.out.println("Absolute value : "+Math.abs(c));
        System.out.println("Min Between 10 and 2 : "+Math.min(a, b));
        System.out.println("Max between 10 & 2 : "+Math.max(a, b));
        float d = 64.00f;
        System.out.println(""+Math.sqrt(d));
        System.out.println("Power 10 ^ 2 "+Math.pow(a, b));
        System.out.println("value of PI : "+Math.PI);
        float e = 10.546f;
        System.out.println(Math.round(e));
        float f = 27;
        System.out.println(Math.cbrt(f));
        System.out.println("Floor Division : "+Math.floorDiv(26,3));
        System.out.println(Math.floor(e));
    }
}
