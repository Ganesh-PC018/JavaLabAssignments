package google;
class StudentData implements Cloneable
{
    private String name;
    private int marks;
    private static String branch="IT";
    void setData(String name,int marks)
    {
        this.name = name;
        this.marks = marks;
    }
    void display()
    {
        System.out.println("Name   : "+name);
        System.out.println("Mark   : "+marks);
        System.out.println("Branch : "+branch);
    }

public Object clone() 
{
        try
        {
            return super.clone();
        }
        catch(CloneNotSupportedException o1)
        {
            return null;
        }
    }

    public static void main(String[] args) {
        StudentData o1 = new StudentData();
        o1.setData("ganesh",100);
        StudentData o2 = (StudentData)o1.clone();
        o1.display();
        o2.display();
    }
}
