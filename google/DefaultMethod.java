package google;
interface showable
{
    void show();
    default void msg()
    {
        System.out.println("Hello im Deafult Method inside the INTREFACES.");

    }
}

public class DefaultMethod implements showable {
    public void show()
    {
        System.out.println("Hello i'm By Deafult public Abstract.");
    }
    public static void main(String[] args) {
        
    }
}
