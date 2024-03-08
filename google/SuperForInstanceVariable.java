package google;
class BabbarSher3
{
    String name;
    BabbarSher3()
    {
        name = "BabbarSher naam hi kafhi hai.";
        System.out.println(name);
    }
}

class Sher3 extends BabbarSher3
{
    String name = "Jaise jyache Karm taise phal Deto he ishwar.";

    Sher3()
    {
        System.out.println("Sher Ab se Meditation karega..");
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Super Name : "+(super.name));
    }

}
public class SuperForInstanceVariable {
    public static void main(String[] args) {
        Sher3 o1 = new Sher3();
        o1.display();
    }
}
