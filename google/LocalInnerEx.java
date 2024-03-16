package google;
class OuterEx2
{
    private int data  = 100;
    void show()
    {
        class LocalInnerEx{
            void display()
            {
                System.out.println("Data : "+data);
            }
        }
        LocalInnerEx local = new LocalInnerEx();
        local.display();
    }
}
public class LocalInnerEx {
    public static void main(String[] args) {
        OuterEx2 objRef = new OuterEx2();
        objRef.show();
        
    }
}
