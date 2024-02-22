package google;
class OutexClassEx
{
    void show()
    {
        System.out.println("Hello show..");
    }

    class InnerClassData
    {
        void display()
        {
            System.out.println("Here we are inside the Inner Class Display Method");
            System.out.println("Its Known as : Java Member Inner Class");
            show();
        }
    }
}
public class InnerClassEx {
    public static void main(String[] args) {
        OutexClassEx out = new OutexClassEx();
        OutexClassEx.InnerClassData in = out.new InnerClassData();
        in.display();
    }
}
