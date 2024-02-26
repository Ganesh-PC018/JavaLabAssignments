package google;
public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("This Method will Call.....!!!");
        main();
        main("Java");
    }
    public static void main(String args) 
    {
        System.out.println("Here is The main Method with String as Arg");
        System.out.println("Hello "+args);
    }
    public static void main() 
    {
        System.out.println("Here is main method without parameters");
    }
}
