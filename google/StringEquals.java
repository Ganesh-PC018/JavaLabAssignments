package google;

public class StringEquals
{
    public static void main(String[] args) {
        String name = "Ganesh";
        String name2 = "Ganesh"; 
        // name and name2 create Reference to name Location in STRING CONSTENT POOL
        String name3 = new String("Ganesh"); 
        //name3 will create our own new Object and it will not refer to same Reference.      
         System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));  
        String name4 = "GANESH";
        System.out.println(name.equalsIgnoreCase(name4));

    }
}