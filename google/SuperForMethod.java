package google;
class Animal1
{
    void eat()
    {
        System.out.println("Eating....");
    }
}

class Dog1 extends Animal1
{
    void eat()
    {
        System.out.println("Eattting in derived...");
        
    }
    void Work()
    {
        eat();
        super.eat();
    }
    
}
public class SuperForMethod {
    public static void main(String[] args) {
        Dog1 tommy = new Dog1();
        // Dog1.eat();
        tommy.Work();
        
    }
}
