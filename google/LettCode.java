package google;

public class LettCode {
    public static void main(String[] args) {
        int a[] = new int[]{9,9,9};
        
        String a1 = new String(String.valueOf(a[0]));

        for(int i=1;i<a.length;i++)
        {
            a1 =a1+a[i];
        }
        System.out.println(a1);
        int data = Integer.parseInt(a1);
        data =data+1;
        System.out.println("data : "+data);
        int l = String.valueOf(data).length();
        System.out.println("legth : "+l);
        int a2[] = new int[l];//new Arr
        for(int i=l-1;i>=0;i--)
        {
            a2[i] = data%10; //
            data = data/10;  //
        }
        
        for(int i=0;i<l;i++)
        {
          System.out.print(a2[i]);
        }
    }
}
