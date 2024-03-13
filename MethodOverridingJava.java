class Parent
{
    public long add(int a,long b)
    {
        return a+b+10;
    }
}
class Override /*extends Parent*/
{

    // @Override
    // public long add(int a,int b)
    // {
    //     return a+b;
    // }

    // public long add(int a,int b,int c)
    // {
    //     return a+b+c;
    // }

    // public long add(long a,int b)
    // {

    //     return a+b;
    // }
    static int data = 100;
    public long add(int a,long b)
    {
        return a+b+data;
    }
    // int a1 = 200;
    public static long add1(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        // int a = 10;
        // System.out.format("%d",&a);
        // a= 20;
        // System.out.format("%d",&a);
        int a;
        Override data = new Override();
        System.out.println(data.add(10, 20));
        // System.out.println(data.add(10l, 20));
        // System.out.println(data.add(10, 20l));
        // System.out.println(a);
        // System.out.println(a);

    }
}

