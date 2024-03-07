package google;
class College
{
    College()
    {
        System.out.println("College has Been Created...");
    }
}

class IT_department extends College
{
    IT_department()
    {
        //Super() is added to each Constructor implicitly/Automatically by Compiler.
        super(); // Super() Called this must be First statement
        System.out.println("And You are in IT Branch of this clg.");
    }
}
public class SuperForConstructor {
    public static void main(String[] args) {
        new IT_department();
    }
}
