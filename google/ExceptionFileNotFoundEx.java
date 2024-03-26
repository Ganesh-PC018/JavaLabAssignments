package google;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class ExceptionFileNotFoundEx {
    public static void main(String[] args) {
        PrintWriter pw;
        try
        {
            pw = new PrintWriter("File.txt");
            pw.write("Saved");
            pw.append("File Not Found");
            pw.write("File will not Display Here");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
            System.out.println("File Not Found....!!");
        }
        finally
        {
            System.out.println("Here is The Finally...!!");
        }
    }
}
