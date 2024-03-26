package google;
import java.util.Scanner;
public class DecisionMakingControlStatements {
    public static void main(String[] args) {
        int num =10;
        if(num < 10)
        {
            System.out.println("The Given Number is less than 10");

        }
        else
        {
            if(num == 10)
            {
                System.out.println("The Given Number is equal to 10.");
            }
            else
            {
                System.out.println("The Given Number is more than 10");
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        // int n = sc.nextInt();
        int n=1;
        // sc.close();
        // int i=0;
        switch(n)
        {
            case 1 :    
                        System.out.println("The Given Number is 1");
                        System.out.println("When i write break after my case then it Controls Flow");
                        System.out.println("They are known as Jump Statement.");
                        break;
            case 2 :
                        System.out.println("The Given Number is 2");
                        break;
            case 3 :
                        System.out.println("The Given Number is 3");
                        break;
            default:
                        System.out.println("Error or More than 3 value Entered");
        }
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println(name+" Your Age : ");
        int age = sc.nextInt();
        System.out.println(name +" Your weight");
        float weight = sc.nextFloat();
        System.out.println("welcome "+name);
        sc.close();

        if(age >= 18)
        {
            if(weight > 50)
            {
                System.out.println("Your are Eligible for blood donation");
            }
            else
            {
                System.out.println("Happy to See Your Courage but unfortunately u are not eligible for Donation");
            }
        }
        else
        {
            System.out.println("Below 18 are not allowed to donate.");
        }
    }

    
}
