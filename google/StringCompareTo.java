package google;

public class StringCompareTo {

    public static void compareValue(int op1)
    {
        if(op1 == 0)
        {
            System.out.println("Both Strings are Equal.");
        }
        else if(op1 > 0)
        {
            System.out.println("First String is Greater than Other One");
        }
        else
        {
            System.out.println("Second one is Greater than First One..");
        }
    }
    public static void main(String[] args) {
        String name = "ganesh";
        String lname = "mane";
        String nick  = "ganesh";
        int op1 = name.compareTo(lname);
        StringCompareTo.compareValue(op1);
        int op2 = name.compareTo(nick);
        StringCompareTo.compareValue(op2);
        int op3 = nick.compareTo("Apple");
        StringCompareTo.compareValue(op3);
    }
}
