package google;

public class StringSplit {
    public static void main(String[] args) {
       String name = "Hello Ganesh i have to reverse this.";
        String arr2[] = name.split("\\s");
        for(String a : arr2)
        {
            System.out.println(a);
        }
        System.out.println("..........................reverse the String........................");
        for(int i = arr2.length-1;i>=0;i--)
        {
            System.out.println(arr2[i]);
        }
    }
}
