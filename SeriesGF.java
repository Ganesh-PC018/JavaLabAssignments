public class SeriesGF {
    static void gfSeries(int N){
        // code here
        int n1 = 0;
        if(N == 0)
        {
            System.out.print(" ");
            return;
        }
        if(N ==1)
        {
            System.out.print(n1);
            return;
        }
        int n2 = 1;
        if(N == 2)
        {
            System.out.print(n1+" "+n2+" ");
            return;
        }
        int n3 = 0;
        System.out.print(n1+" "+n2+" ");
        recursion(N,3,n1,n2,n3);
       
    }
    
    public static void recursion(int N,int index,int n1,int n2,int n3)
    {
            if(N < index)
            {
                return;
            }
            n3 = n1*n1-n2;
            System.out.print(n3+" ");
            recursion(N,index+1,n2,n3,0);
    }

    public static void main(String[] args) {
        SeriesGF obj = new SeriesGF();
        obj.gfSeries(10);
    }
}
