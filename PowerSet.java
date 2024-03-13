import java.util.*;
class PowerSet
{
  public List<String> AllPossibleStrings(String s) {
      List<String> result = new ArrayList<>();
      generateSubsequences(s, "", result);
      Collections.sort(result); // Sorting the result lexicographically
        return result;
    }
    
    private void generateSubsequences(String original, String current, List<String> result) {
        if (!current.equals("")) { // Exclude empty string
            result.add(current);
        }
        for (int i = 0; i < original.length(); i++) {
            generateSubsequences(original.substring(i + 1), current + original.charAt(i), result);
        }
    }

    public static void main(String []mane)
    {
        System.arraycopy(neg,0,neg.length,a,0);
        

    }
}