package google;
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
// import java.util.*;

class removeVowels{
    public static void main(String args[]) throws IOException {
        // BufferedReader read =
        //     new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(read.readLine());
        // while (t-- > 0) {
        //     String s = read.readLine();
            
            Solution10 ob = new Solution10();
            String result = ob.removeVowels("geeks For Geek");
            
            System.out.println(result);
        // }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution10 {
    String removeVowels(String S) {
        // code here
        int start =0;
        char []charArray = S.toCharArray();
        String vowels = "aeiouAEIOU";
        StringBuilder data = new StringBuilder();
        int end = S.length()-1;
        while(start <= end)
        {
            if(vowels.indexOf(charArray[start]) == -1)
            {
                data.append(charArray[start]);
            }
            start++;
        }
        
        S  = data.toString();
        return S;
    }
}
