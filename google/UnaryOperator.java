package google;
class UnaryOperator
{
    int b;
    public static void main(String []args)
    {
        int a =10; //local Variable
        UnaryOperator o1  = new UnaryOperator();
        o1.b = 10;
        System.out.println(++a + ++a); // 11 + 12 = 23
        System.out.println(o1.b++ + o1.b++);//10 + 11 = 21
        a=10;
        System.out.println(++a + a++); //11 + 11 = 22
        o1.b=10;
        System.out.println(o1.b++ + ++o1.b);//10 + 11 = 22

        int c =10;
        System.out.println("~ Operator is NOT Operator : "+(~c));//to calculate (-)c - 1 = result
        c=-10;
        System.out.println("When value is negative the -(-c) = c-1 : "+(~c));
        boolean isit = false;
        System.out.println("Is it True : "+!isit);
    }
}; // semicolon is optional Hereṇṇ