package google;
class Operation 
{
    double square(double a)
    {
        return a*a;
    }
}
class Circle
{
    final float pi = 3.14f;
    double a;
    Operation op;

    double area(double r)
    {
        op = new Operation();
        double rsquare = op.square(r);
        return rsquare*pi;
    }
}

class AggregationInJava
{
    public static void main(String[] args) {
        Circle d = new Circle();
        System.out.println("Circle : "+ d.area(7));
    }
}