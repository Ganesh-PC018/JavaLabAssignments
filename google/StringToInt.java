package google;

public class StringToInt {
    public static void main(String[] args) {
        String marks = "100";
        System.out.println(marks);
        Integer i = Integer.valueOf(marks);
        System.out.println(i);
        int i1 = Integer.valueOf(marks);
        System.out.println(i1);
        int i2 = Integer.parseInt(marks);
        System.out.println(i2);

        int enroll = 501;
        String n = String.valueOf(enroll);
        System.out.println(n);
        String n2 = String.valueOf(i2);
        System.out.println(n2);

        String n3 = Integer.toString(enroll);
        System.out.println(n3);
    }
    
}
