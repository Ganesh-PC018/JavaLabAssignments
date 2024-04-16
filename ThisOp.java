public class ThisOp {
    String year,month,name,dept;
    int date;
    static String status = "Persuing";
    ThisOp(String year,int date,String month)
    {
        this("Pavan","IT");
        this.year = year;
       this.date = date;
       this.month = month;
    }

    ThisOp(String name,String dept)
    {
        // this("2024","March");  Recursive Constructor Invocation
        this.name = name;
        this.dept = dept;
    }
    // ThisOp()
    // {

    // }
    public void function()
    {
        System.out.println("Hello");
        this.function();
    }
    public void main(String[] args) {

       ThisOp obj = new  ThisOp("Ganesh","IT");
    //    System.out.println("Name : "+obj.name);
    //    System.out.println("dept : "+obj.dept);
    //    System.out.println("Year : "+obj.year);
    //    System.out.println("Date : "+obj.date);
    //    System.out.println("month: "+obj.month);
    //    System.out.println("Status : "+obj.status);

    //    ThisOp obj1  = new ThisOp("Mane", "CSE");
    //    System.out.println("Name : "+obj1.name);
    //    System.out.println("dept : "+obj1.dept);
    //    System.out.println("Year : "+obj1.year);
    //    System.out.println("Date : "+obj1.date);
    //    System.out.println("month: "+obj1.month);
    //    System.out.println("Status : "+obj1.status);
       
    //    obj1.status = "Passed";
    //    System.out.println("Status : "+obj.status);
    //    System.out.println("Status : "+obj1.status);
        obj.function();



    }
}
