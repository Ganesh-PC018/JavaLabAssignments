import java.io.*;
public class FileInputStreamEx {
    
    public static void main(String[] args) {
        try
        {
            // File file = new File("Hello.txt");
            FileInputStream fis = new FileInputStream("Hello.txt");
            FileOutputStream fos = new FileOutputStream("helloOP.txt");

            int byteData;
            while((byteData = fis.read()) != -1)
            {
                fos.write(byteData);
            }
            fis.close();
            fos.flush();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
    }
}
