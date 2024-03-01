package google;
interface drawable
{
    void draw();
    interface paintable
    {
        void paint();
    }
}
public class NestedInterface implements drawable {
   public  void draw()
    {
        System.out.println("Drawing....!");
    }
    public void paint()
    {
        System.out.println("Paint");
    }
    public static void main(String[] args) {
        NestedInterface o1 = new NestedInterface();
        o1.draw();
        o1.paint();
    }
}
