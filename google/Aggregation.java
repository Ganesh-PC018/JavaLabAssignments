package google;
class Employee
{
    int id;
    String name;
    Address address;
    public Employee(int id,String name,Address address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display()
    {
        System.out.println("id \t: "+id);
        System.out.println("Name \t: "+name);
        System.out.println("City \t: "+address.city);
        System.out.println("State \t: "+address.state);
        System.out.println("Country : "+address.Country);
    }
}
public class Aggregation {
    public static void main(String[] Hello) 
    {
        Address ad1 = new Address("Chh. Sambhajinagar", "Maharashtra", "Bharat");
        Address ad2 = new Address("Pune", "Maharashtra", "India");

        Employee em1 = new Employee(501,"Ganesh Mane", ad1);
        Employee em2 = new Employee( 2026035,"Mane Ganesh", ad2);
        em1.display();
        System.out.println("-----------------------------------------!");
        em2.display();
    }
}
