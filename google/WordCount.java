package google;
public class WordCount {
    public static void main(String[] args) {
        String self = "Hello  i am Java Developer.";
        String word[] = self.split("\\s");
        for(String a : word)
        {
            System.out.println(a);
        }
        System.out.println("length : "+word.length);
    }
}
