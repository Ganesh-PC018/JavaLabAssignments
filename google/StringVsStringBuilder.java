package google;

public class StringVsStringBuilder {
    public static String concatWithString(String s)
    {
        for(int i=0;i<10000;i++)
        {
            s = s.concat(" Mane");
        }
        return s;
    }

    public static String appendWithStringBuilder(StringBuilder sb)
    {
        for(int i=0;i<1000000;i++)
        {
            sb.append(" Mane");
        }
        return sb.toString();
    }
    public static String appendWithStringBuffer(StringBuffer sb)
    {
        for(int i=0;i<1000000;i++)
        {
            sb.append(" Mane");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatWithString("Ganesh ");
        System.out.println("Time Taken by String        : "+(System.currentTimeMillis()-startTime)+" ms");
        startTime = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder("Ganesh");
        appendWithStringBuilder(s2);
        System.out.println("Time Taken by StringBuilder : "+(System.currentTimeMillis()-startTime)+" ms");
        startTime = System.currentTimeMillis();
        StringBuffer s3 = new StringBuffer("Ganesh");
        appendWithStringBuffer(s3);
        System.out.println("Time Taken by String Buffer : "+(System.currentTimeMillis()-startTime)+" ms");

        
    }
}
