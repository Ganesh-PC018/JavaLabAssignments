import java.io.*;
public class BufferedInputStreamEx {
    public static void main(String[] args) {
        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));
        int byteData;
        while((byteData = bis.read()) != -1)
        {
            System.out.println(byteData);
            bos.write(byteData);
        }
        bis.close();
        bos.flush();
    }catch(Exception e)
    {
        System.err.println("error");
    }

    }
}
