class SuperParent
{
    String str;
    SuperParent(String str)
    {
        this.str = str;
    }

    SuperParent()
    {
        System.out.println("Hello instead of Super you can use this");
    }
}
public class SuperKey extends SuperParent
{
    String s;
    SuperKey(String s)
    {
        // super("Hello");
        //it implicitly Called but when Constructor is declared then we have to difine Here
        this.s =s;
    }
    public static void main(String[] args) {
        
    }

}