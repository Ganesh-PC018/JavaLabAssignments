package google;
interface OuterInterface
{
    void show();
    interface InnerInterface
    {
        void msg();
    }
}
public class InterfaceInsideInterfaceEx implements OuterInterface.InnerInterface {
    public void msg()
    {
        System.out.println("Message Displayed...!!!");
    }
    public static void main(String[] args) 
    {
        OuterInterface.InnerInterface dataObj = new InterfaceInsideInterfaceEx();
        //upcasting 
        dataObj.msg();
    }
}
