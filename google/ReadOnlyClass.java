package google;
class ReadEx
{
    private String Aadhar = "3065-1433-8063";
    public String getData()
    {
        return Aadhar;
    }
}
public class ReadOnlyClass {
    public static void main(String[] args) 
    {
        ReadEx o1 = new ReadEx();
        System.out.println("Aadhar Number : "+o1.getData());
        // System.out.println("if we try to modify it will show an error msg");
    }
}
