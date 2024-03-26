package google;

public class CloneObjectEx implements Cloneable{

    private String name;
    private int roll;
    void setData(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    void display()
    {
        System.out.println("name : "+name);
        System.out.println("Roll : "+roll);
    }
    public Object clone()
    {
        try
        {

            return super.clone();
        }catch(CloneNotSupportedException o1)
        {
            return null;
        }
    }
    
    public static void main(String[] args) {
        CloneObjectEx o1 = new CloneObjectEx();
        o1.setData("Ganesh", 100);
        CloneObjectEx o2 = (CloneObjectEx)o1.clone();
        o1.display();
        o2.display();
    }
}
