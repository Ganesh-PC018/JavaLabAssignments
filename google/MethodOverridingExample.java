package google;
class Rustum_Mane
{
    Rustum_Mane()
    {
        System.out.println("Welcome to Rustum Mane's World..");
    }

    void occupation()
    {
        System.out.println("He is Farmer...");
        System.out.println("works hard..");
        System.out.println("Not Well Educated..");
    }
}

class Ganesh extends Rustum_Mane
{
    Ganesh()
    {
        System.out.println("Ganesh Mane Born.");
    }
    void occupation()
    {
        System.out.println("Rustum Mane's Son..");
        System.out.println("Well Educated...");
        System.out.println("Upcoming SDE");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Ganesh obj = new Ganesh();
        obj.occupation();
    }
}
