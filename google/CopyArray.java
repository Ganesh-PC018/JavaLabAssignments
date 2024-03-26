package google;

public class CopyArray {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };  
        char[] copyTo = new char[11];
        System.arraycopy(copyFrom, 0, copyTo, 0, 11);
        String a = String.valueOf(copyTo);//Typcasting 
        System.out.println("After Copy : "+a);
        char[] cloneChar = copyFrom.clone();
        for(int i=0;i<cloneChar.length;i++)
        {
            System.out.print(cloneChar[i]);
        }
        System.out.println();
        for(char b : cloneChar)
        {
            System.out.print(b);
        }
    }
}
