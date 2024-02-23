package google;
class BabbarSher2
{
    void raja()
    {
        System.out.println("Raja hu mai is jangal ka Raja..");
    }
}
class Sher1 extends BabbarSher2
{
    void eat()
    {
        System.out.println("Mai to Babbar sher ka beta hu Muze Khana Khana hai\n Chalo Shikar karne.");

    }
}

class Sher2 extends BabbarSher2
{
    void Rule()
    {
        System.out.println("Babbar sher ka Rajya Badhane ki Chinta hal rahi hai.");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Sher1 chhava = new Sher1();
        chhava.raja();
        chhava.eat();
        Sher2 bachhada = new Sher2();
        bachhada.raja();
        bachhada.Rule();
        
    }
}
