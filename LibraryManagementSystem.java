import java.util.ArrayList;
import java.util.HashMap;

class Categories extends Book
{

}
class Book
{
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Long> price = new ArrayList<>();
    ArrayList<Long> sr_no = new ArrayList<>();
    ArrayList<Integer> book_count = new ArrayList<>();
    ArrayList<String> author = new ArrayList<>();
    ArrayList<String> cat = new ArrayList<>();

    int i=0;
    public void addBooks(String  name1,long price1,long sr_no1,String author1,String cat1)
    {
        name.add(name1);
        price.add(price1);
        sr_no.add(sr_no1);
        book_count.add(++i);
        author.add(author1);
        cat.add(cat1);
    }

    public void removeBook(String  name1,long price1,long sr_no1,String author1,String cat1)
    {
        name.remove(name1);
        price.remove(price1);
        sr_no.remove(sr_no1);
        author.remove(author1);
        book_count.add(--i);
        cat.remove(cat1);
    }
    public void printData()
    {
        for(int j=0;j<name.size();j++)
        {
            // System.out.println(name[j]+" "+price[j]+" "+sr_no[j]+" "+author[j]+" "+cat[j]);
            System.out.println(name.get(j)+" "+price.get(j)+" "+sr_no.get(j)+" "+author.get(j)+" "+cat.get(j));
        }
        System.out.println(book_count.getLast());
    }

}

class Librarian extends Book 
{
   static String password = "demo";
   public Librarian(String pass)
   {
        if(password.equals(pass))
        {
            System.out.println("Password is Correct...!!!");
            this.login();
        }
        else
        {
            System.out.println("Incorrect Password.....!!!");
        }
   }

   public void login()
   {
    Book o = new Book();
    o.addBooks("Opearting System", 525l, 1427892l,"Peter Galvin", "Technology");
    o.addBooks("Opearting System", 525l, 1427892l,"Peter Galvin", "Technology");
    o.addBooks("Opearting System", 525l, 1427892l,"Peter Galvin", "Technology");
    o.addBooks("Opearting System", 525l, 1427892l,"Peter Galvin", "Maths");
    o.addBooks("Opearting System", 525l, 1427892l,"Peter Galvin", "Technology");
    o.addBooks("Opearting System", 525l, 1427892l,"Peter Galvin", "Biology");
    o.printData();
    System.out.println("-------------------------------------------------------------------------------");
    o.removeBook("Opearting System", 525l, 1427892l,"Peter Galvin", "Biology");
    o.removeBook("Opearting System", 525l, 1427892l,"Peter Galvin", "Technology");
    o.printData();
    
   }

}

class Student
{
    ArrayList<String> St_name = new ArrayList<>();
    ArrayList<String> studentId = new ArrayList<>();
    ArrayList<String> dept = new ArrayList<>();
    HashMap<String,Integer> book_issued = new HashMap<>();
    ArrayList<String> dueDate = new ArrayList<>();
    ArrayList<Long> penalty = new ArrayList<>();
    
    public void addStudent(String  name1,String studentId,String dept,String due,Long penalty)
    {
        St_name.add(name1);
        this.studentId.add(studentId);
        this.dept.add(dept);
        this.book_issued.put(studentId,book_issued.getOrDefault(studentId, 0)+1);
        dueDate.add(due);
        this.penalty.add(penalty);
    }
    public void removeStudent(String  name1,String studentId,String dept,String due,Long penalty)
    {
        St_name.remove(name1);
        this.studentId.remove(studentId);
        this.dept.remove(dept);
        this.book_issued.remove(book_issued);
        dueDate.remove(due);
        this.penalty.remove(penalty);
    }

}
public class LibraryManagementSystem {
    public static void main(String[] args) {
      Librarian sir1 = new Librarian("demo");
    }
}
