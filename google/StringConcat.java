package google;

public class StringConcat {
    public static void main(String[] args) 
    {
        String name = "ganesh";
        String lname = " mane";
        System.out.println(name.concat(lname));
        System.out.println(name+lname);
        System.out.format("%s%s\n",name,lname);
        StringBuilder n1 = new StringBuilder("Ganesh");
        StringBuilder n2 =  new StringBuilder("Ganesh");
        System.out.println(n1.append(n2));
        System.out.println("Name : "+n1);
    }
}
