//{ Driver Code Starts
    package google;
//Initial Template for Java
// import java.util.*;
import java.io.*;
class isPalindromeEx {
    public static void main(String args[]) throws IOException {
        // BufferedReader read =
        //     new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(read.readLine());
        // while (t-- > 0) {
        //     long n = Integer.parseInt(read.readLine());
            Solution11 ob = new Solution11();

            System.out.println(ob.isSumPalindrome(73));
        }
    // }
}
// } Driver Code Ends


//User function Template for Java
class Solution11 {
    long isSumPalindrome(long n){
        // code here
        long rev =0;
        long temp =n;
        long rem=0;
        boolean isPalindrome= true;
        while(isPalindrome)
        {
        while(n > 0)
        {
            rem = n%10;
            rev = rev*10+rem;//37+73
            n = n/10;
        }
     
        if(rev == temp)
        {
            isPalindrome =false;
            return temp;
        }
        n = temp + rev;  // Update n to the sum of temp and rev
        temp = n; 
        rev = 0;
        }
        return -1;
    }
}