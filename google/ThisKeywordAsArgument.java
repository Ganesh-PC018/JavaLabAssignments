package google;
public class ThisKeywordAsArgument
{
    void show(ThisKeywordAsArgument o1)
     {
        System.out.println("Method invokeed...!!!");
     }
    ThisKeywordAsArgument()
    {
        System.out.println("ThisKeyword Constructor.");
    }
    void Call()
    {
        show(this);
    }
    public static void main(String[] args) {
        ThisKeywordAsArgument object = new ThisKeywordAsArgument();
        object.Call();
    }
}