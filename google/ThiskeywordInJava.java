package google;
class Student3
{
    String name;
    int roll,fee=0;
    Student3(String name,int roll)
    {
        name = this.name;
        roll = this.roll;
        this.fee = 0;
    }
    Student3(String name,int roll,int fee)
    {
        this(name,roll);
        this.fee = fee;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("roll : "+roll);
        System.out.println("Fee  : "+fee);
    }
}

public class ThiskeywordInJava {
    public static void main(String[] args) {
        Student3 object = new Student3("Ganesh",501);
        object.display();
        Student3 object1 = new Student3("Mane",2026,75341);
        object1.display();
    }
}
