package google;

public class AutoboxingWrapper {
    public static void main(String[] args) {
        int a = 10;
        byte b = 114;
        float c = 10.5f;
        Integer a1 = Integer.valueOf(a);  //Explicit Casting to Object
        Integer a2 = a;  // Autoboxing
        System.out.println(a1.getClass());
        System.out.println(a2.getClass());
        Byte b1 = Byte.valueOf(b); //explicit catring from primitive to Object
        Byte b2 = b;//autoboxing
        System.out.println(b2.getClass());
        System.out.println(b1.getClass());
        Float c1 = Float.valueOf(c);//explicit casting from primitive to Object
        Float c2 = c;//Autoboxing
        System.out.println(c1.getClass());
        System.out.println(c2.getClass());
        // System.out.println(int.getClass());
    }
}
