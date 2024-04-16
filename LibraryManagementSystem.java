import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;
class Categories extends Book {
    // You can add specific methods or attributes for Categories here
}

class Book {
    String name = null, book_author = null, cat = null;
    Long price = 0L, sr_no = 0L;
    Integer book_count;

    int i = 0;

    public Book addBooks() {
        Book obj = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Name : ");
        obj.name = sc.nextLine();
        System.out.print("Enter Book Price : ");
        obj.price = sc.nextLong();
        System.out.print("Enter Book Serial Number : ");
        obj.sr_no = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Book  Author : ");
        obj.book_author = sc.nextLine();
        System.out.print("Enter Book  Category : ");
        obj.cat = sc.nextLine();
        return obj;
    }

    public Boolean removeBook(HashSet<Book> obj)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Serial Number to Delete Book : ");
        long deleteBook = sc.nextLong();
        Iterator<Book> iterator = obj.iterator();
        Boolean isAvailable = false;
        while (iterator.hasNext()) {
             Book currentBook = iterator.next();
             if(currentBook.sr_no == deleteBook)
             {
                    iterator.remove();
                    isAvailable = true;
            }  
            }
            return isAvailable;     
    }
    public void printData(HashSet<Book> obj)
    {
        Iterator<Book> iterator1 = obj.iterator();
                while (iterator1.hasNext()) {
                System.out.println(iterator1.next());
             }
    }
    public String toString() {
        return "Book{" +
                "title='" + name + '\'' +
                ", author='" + book_author + '\'' +
                ", price='" + price + '\'' +
                ", Serial ='" + sr_no + '\'' +
                '}';
    }
}

class StudentDetails
{
    
    String name = null,  enrollment_number= null, departement = null;
    Long  issuedBookCount= 0L,  panalty= 0L;
    // Integer book_count;

    public void printData(HashSet<StudentDetails> obj)
    {
        Iterator<StudentDetails> iterator1 = obj.iterator();
                while (iterator1.hasNext()) {
                System.out.println(iterator1.next());
             }
    }

    public Boolean removeStudent(HashSet<StudentDetails> obj)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Serial Number to Delete Book : ");
        String deleteEnroll = sc.nextLine();
        Iterator<StudentDetails> iterator = obj.iterator();
        Boolean isAvailable = false;
        while (iterator.hasNext()) {
             StudentDetails currentStudent = iterator.next();
             if(currentStudent.enrollment_number.equalsIgnoreCase(deleteEnroll))
             {
                    iterator.remove();
                    isAvailable = true;
            }  
            }
            return isAvailable;     
    }

    public StudentDetails addStudent(HashSet<StudentDetails> StudentSet) {

        StudentDetails obj = new StudentDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        obj.name = sc.nextLine();
        System.out.print("Enter Student Enrollment : ");
        obj.enrollment_number = sc.nextLine();
        System.out.print("Enter Student Department : ");
        obj.departement = sc.nextLine();
        // sc.nextLine();
        System.out.print("Enter Student  issued Books Count : ");
        obj.issuedBookCount = sc.nextLong();
        System.out.print("Enter Student Panalty : ");
        obj.panalty = sc.nextLong();
        boolean isAlready = true;
        Iterator<StudentDetails> iterator =  StudentSet.iterator();
        while(iterator.hasNext())
        {
            StudentDetails currentStudent = iterator.next();
            if(currentStudent.enrollment_number.equalsIgnoreCase(obj.enrollment_number))
            {
                System.out.println("Already Registered.....!!!");
                isAlready = false;
            }
            
        }
        if(isAlready)
        {
            System.out.println("Student Added Successfully....!!!");
        }
        return obj;
    }
   
    public String toString() {
        return "Student Details{" +
                "Student Name='" + name + '\'' +
                ", Enrollment ='" + enrollment_number + '\'' +
                ", Department='" + departement + '\'' +
                ", Issued Books ='" +issuedBookCount + '\'' +
                ", Penalty ='" +panalty + '\'' +
                '}';
    }
}
class Librarian extends Book {
    static String password = "demo";

    public void isValid(String pass) {
        if (password.equals(pass)) {
            System.out.println("Password is Correct...!!!");
            this.dropDownMenu();
        } else {
            System.out.println("Incorrect Password.....!!!");
        }
    }

    public void dropDownMenu() {

        Scanner choiceInput = new Scanner(System.in);
        HashSet<Book> obj = new HashSet<Book>();
        StudentDetails temp = new StudentDetails();
        Librarian bookTemp = new Librarian();
        HashSet<StudentDetails> studentData = new HashSet<StudentDetails>();
        String again = "no";
        do
        {
        System.out.println("\t\t\tEnter Your Choice\n");
        System.out.println("1.0\t\tAdd Book");
        System.out.println("2.0\t\tRemove Book");
        System.out.println("3.0\t\tAdd Student");
        System.out.println("4.0\t\tRemove Student");
        System.out.println("5.0\t\tPrint Book Data ");
        System.out.println("6.0\t\tPrint Student Data ");
        System.out.print("Enter Here : ");
        int choice = choiceInput.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter The Number of Books to Add : ");
                int totalAdd = choiceInput.nextInt();
                for (int i = 0; i < totalAdd; i++) {
                    obj.add(addBooks());
                }
                System.out.println("Books Added Successfully....!!!");
                break;
            case 2:
                if(bookTemp.removeBook(obj))
                {
                    System.out.println("Successfully Removed....!!!");
                }
                else
                {
                    System.out.println("Something Went Wrong...!!!");
                }
                break;

            case 3 :
                System.out.println("Enter The Number of Students to Add : ");
                int totalStudent = choiceInput.nextInt();
                for (int i = 0; i < totalStudent; i++) {
                    studentData.add(temp.addStudent(studentData));
                }
                break;
            case 4:
                if(temp.removeStudent(studentData))
                {
                    System.out.println("Successfully Removed....!!!");
                }
                else
                {
                    System.out.println("Something Went Wrong...!!!");
                }
            break;
            case 5 : 
                    bookTemp.printData(obj);
                    break;
            case 6 :
                    temp.printData(studentData);
                    break;
                 
             }
            
        
        
        System.out.print("Do You Want to Continue Again : ");
        choiceInput.nextLine();
        again = choiceInput.nextLine();
        }while(again.equalsIgnoreCase("YES"));
    }
    public void login() {
        // Your login logic can go here
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Librarian sir1 = new Librarian();
        String passwd = LibraryManagementSystem.enterPassword();
        sir1.isValid(passwd);
    }

    public static String enterPassword()
    {
        Console console = System.console();
        if (console == null) {
            System.out.println("Console not available. Exiting...");
            return null;
        }
        char[] passwordChars = console.readPassword("Enter your password: ");
        String password = new String(passwordChars);

        return password;
    }
}
