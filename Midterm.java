class Exam
{
    static
    {
        System.out.println("Static 1:: Exam");
    }
    Exam()
    {
        System.out.println("Exam Constructor");
    }
    {
        System.out.println("Init :: Exam");
    }
    static
    {
        System.out.println("Static 2:: Exam");
    }
}

public class Midterm extends Exam {
    static
    {
        System.out.println("Static 1 :: MidTerm");
    }
    Midterm()
    {
        System.out.println("Midterm Constructor");
        
    }

    {
        System.out.println("Init :: Midterm");
    }
    static
    {
        System.out.println("Static 2 :: MidTerm");
    }
    
    public String toString()
    {
        return "MidTerm";
    }
    
    public static void main(String[] args) {
        
        System.out.println("Welcome------");
        Exam exam = new Exam();
        Midterm mid = new Midterm();
        System.out.println(mid);
    }
    
}
