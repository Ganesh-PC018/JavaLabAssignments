package google;

public class StringSubstring {
    public static void main(String[] args) {
        String name = "Myself Ganesh Mane. I'm a enthusiast programmer.";
        System.out.println(name.substring(0));
        System.out.println(name.substring(7, 19));
        String name1 ="Hello,Ganesh Mane,How are You ?";
        String name2[] = name1.split("\\,");
        for(String a : name2)
        {
            System.out.println(a);
        }
    }
}
