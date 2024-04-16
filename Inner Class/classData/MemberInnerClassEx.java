package classData;

// import classData.MemberInnerClassEx.InnerClas;

class MemberInnerClassEx
{
    private int data = 101;

    class InnerClas
    {
        public void msg()
        {
            System.out.println("Data in outer : "+data);
        }
    }
    public static void main(String[] args) {
        MemberInnerClassEx obj = new MemberInnerClassEx();
    
        InnerClas obj1 = obj.new InnerClas();
        obj1.msg();
    }

}

class MemberAccessClass
{
    public static void main(String[] args) {
        MemberInnerClassEx obj = new MemberInnerClassEx();
        // System.out.println(obj.data);
        MemberInnerClassEx.InnerClas obj1 = obj.new InnerClas();
        obj1.msg();
    }
    
}