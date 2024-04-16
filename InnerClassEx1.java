public class InnerClassEx1 {
    int data = 100;

    class InnerClassEx2
    {
        public void msg()
        {
            System.out.println("The Data : "+data);
        }

    }


    public static void main(String[] args) {
        InnerClassEx1 obj = new InnerClassEx1();
        // InnerClassEx2 obj2 = new InnerClassEx2();
    }
}
