package google;

public class StackOverError {
    
     void show()
     {
        System.out.println("Wait For Stack Overflow..!");
        show();
     }
     public static void main(String[] args) {
        StackOverError o1 = new StackOverError();
        o1.show();
     }
}
