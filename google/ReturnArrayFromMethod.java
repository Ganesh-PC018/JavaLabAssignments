package google;

public class ReturnArrayFromMethod {
    public  int[] getArray()
    {
        return (new int[]{10,20,30,40});
    }
    public static void main(String[] args) {

        int arr[] = new ReturnArrayFromMethod().getArray();
        for(int i :arr)
        {
            System.out.println(i);
        }
    }
}
