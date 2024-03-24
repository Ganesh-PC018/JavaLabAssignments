package google;

class ValueEx
{
    int value = 100;
    void setData(int data)
    {
        data = data + value;
    }
    
    void setData(ValueEx o1)
    {
        o1.value = 100 +o1.value;
    }
}
public class CallByValueNReference {
    public static void main(String[] args) {
        ValueEx o1 = new ValueEx();
        System.out.println("Before Printing : "+o1.value);
        o1.setData(500);
        System.out.println("After Printing   : "+o1.value);
        System.out.println("Before Printing by Reference : "+o1.value);
        o1.setData(o1);
        System.out.println("After Printing Reference : "+o1.value);
    }
}
