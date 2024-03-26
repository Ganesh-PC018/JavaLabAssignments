package google;

public class StringtoStringMeth {
    String name,city;
    int enroll;
    StringtoStringMeth(String name,int enroll,String city)
    {
        this.name = name;
        this.city = city;
        this.enroll = enroll;
    }

    public String toString()
    {
        return enroll+" "+name + " " +city;
    }
    public static void main(String[] args) {
        StringtoStringMeth o1 = new StringtoStringMeth("Ganesh", 501,"Pune");
        System.out.println(o1);
        
        StringtoStringMeth o2 = new StringtoStringMeth("Mane", 501,"Sambhajinagar");
        System.out.println(o2);

    }
}
