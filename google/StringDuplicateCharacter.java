package google;
public class StringDuplicateCharacter {
     public static void isDuplicate(String s)
     {
        s = s.replaceAll("\\s", ""); 
        char []arr = s.toLowerCase().toCharArray();//ganesh
        int []arrStored = new int[26]; 
        for(int i=0;i<26;i++)
        {
            arrStored[i] = 0;
        }
      
        for(int i=0;i<arr.length;i++)
        {
            int place = arr[i] - 'a';//g-a
            arrStored[place]++; //7++ =1
        }
        for(int i=0;i<arrStored.length;i++)
        {
            if(arrStored[i] > 1)
            {
                char ch = (char)(97 + i);
                System.out.println(ch);
            }
         
        }
     } 
    public static void main(String[] args) {
        isDuplicate("Aakash");
    }
}
