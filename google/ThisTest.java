package google;
class Test{
    Test()
    {
        System.out.println(this);
    }
    
}
public class ThisTest {

    ThisTest()
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        new ThisTest();    //Anonymous Object Declaration
        new Test(); 

    }
}
