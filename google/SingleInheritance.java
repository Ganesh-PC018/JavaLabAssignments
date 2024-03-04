package google;
class Animal
{
    void eat()
    {
        System.out.println("Eating....!!");
    }
}

class Dog extends Animal       //Single Inheritance
{ 
    void bark()
    {
        System.out.println("Ha bhai Sahi Kaha mai Bokhta hu");
        System.out.println("Tu Aapne Padhai pe dhyan do");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog ronu = new Dog();
        ronu.bark();
        ronu.eat();
    }
}
