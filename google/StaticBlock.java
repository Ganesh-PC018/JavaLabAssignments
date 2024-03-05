package google;
public class StaticBlock {
        static
        {
            System.out.println("Static blocked executed....!!");
        }
        static void Method_static()
        {
            System.out.println("Static Method");
            System.out.println("Name : ");
        }
        public static void main(String[] args) {
            System.out.println("Static Block Craeted as block but named it static");
           StaticBlock.Method_static();
    }
}
