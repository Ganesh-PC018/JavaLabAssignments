class OuterClass
{
    String name;
    //Constructor
    OuterClass()
    {

    }
    // OuterClass(String name)
    // {
    //     this.name = name;
    // }
    //member Function
    public void fatherName(String name)
    {
        this.name = name;
    }

    class InnerClass
    {
        String name;
        // InnerClass(String name)
        // {
        //     this.name = name;
        // }

        public void sonFather(String name)
        {
            this.name = name;
        }

        public void printData()
        {
            System.out.println(OuterClass.this.name+" "+this.name);
        }
    }

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.fatherName("Ganesh");
        InnerClass obj1 = obj.new InnerClass();
        obj1.sonFather("Mane");
        obj1.printData();
    }
}

// class InnerClassData {
//     OuterClass 
// }
