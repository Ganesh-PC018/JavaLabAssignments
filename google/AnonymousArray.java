package google;

public class AnonymousArray {
     public static void printArray(int Arr[])
     {
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
     }
    public static void main(String[] args) {
        printArray(new int[]{10,20,30,40,50});
        /*
         * new int[]{values};   //anonymous Array 
         * new ClassName();     //Anonymous Object
         */
    }
}
