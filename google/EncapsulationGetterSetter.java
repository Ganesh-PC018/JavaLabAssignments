package google;
class SetterGetter{
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}


public class EncapsulationGetterSetter
{
    public static void main(String[] args) {
        SetterGetter o1 = new SetterGetter();
        o1.setName("ganesh");
        System.out.println("Name : "+o1.getName());
    }
}

