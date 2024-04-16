public class InnerClassEx {
    String clgName;

    InnerClassEx(String clgName)
    {
        this.clgName = clgName;
    }


    class Department
    {
        String deptName;

        Department(String deptName)
        {
            this.deptName = deptName;
        }

    }
    public String getDetails()
    {
        return "ClgName : "+clgName+" "+InnerClassEx.this.clgName+this.clgName;
    }
    public static void main(String []args)
    {
        InnerClassEx obj = new InnerClassEx("SGGS");
        Department obj2 = obj.new Department("IT");
        System.out.println(obj.getDetails());
    
    }
}
