package google;
class Kingdom
{
    void eat()
    {
        System.out.println("maine Khana Khaya hai..!");
    }
}
class BabbarSher extends Kingdom
{
    void hunting()
    {
        System.out.println("Aaj Sher phad ke aaya hai..!");
    }
}

class Sher extends BabbarSher
{
    void inspring()
    {
        System.out.println("sher to Babbarsher se Hunting ke liye bohot Inspiration milti hai.");
    }
}
public class MultilevelInhritance {
    public static void main(String[] args) {
        Sher ganesh= new Sher();
        ganesh.eat();
        ganesh.hunting();
        ganesh.inspring();
    }
}
