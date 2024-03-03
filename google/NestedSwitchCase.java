package google;
public class NestedSwitchCase {
    public static void main(String[] args) {
        int Year =2;
        char Branch = 'I';

        switch(Year)
        {
            case 1 :
                    System.out.println("physics,Maths,Science");
                    break;
            case 2 :
                    System.out.println("Second Year");
                    switch(Branch)
                    {
                        case 'I' : 
                                    System.out.println("DSA,Java,React");
                                    break;
                        case 'C' :
                                    System.out.println("DSA,Java,python");
                                    break;
                        default   :
                                    System.out.println("Error");
                    }
                    break;
            case 3 :    
                    System.out.println("Third Year.");
                    switch(Branch)
                    {
                        case 'I' :
                                    System.out.println("python,OS,Netwoking");
                                    break;
                        case 'C' :
                                    System.out.println("Netwoking Advance Java and Blockchain");
                                    break;
                        default  :
                                    System.out.println("Error");
                    }
                    break;
            default :
                        System.out.println("Error..");

        }
    }
}
