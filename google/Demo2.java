// package google;

// import java.io.*;
// import java.util.*;

//   public class Demo2 {
//     public static void main(String[] args) throws IOException {
//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();
//         while (T > 0) {
//             int n = sc.nextInt();
//             int arr[] = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             // System.out.println();
//             int key = sc.nextInt();
//             Solution g = new Solution();
//             System.out.println(g.binarysearch(arr, n, key));
//             T--;
//         }
//         sc.close();
//     }
// }

// // } Driver Code Ends


// // User function Template for Java

// class Solution {
//     int binarysearch(int arr[], int n, int k) {
//         // code here
//         int high = n-1;
//         int low = 0;
//         int count =0;
//         while(low < high)
//         {
//             int mid = (low + high)/2;
//             if(k == arr[mid])
//             {
//                 return ++count;
//             }
//             else if(k > arr[mid])
//             {
//                 low = mid+1;
//                 count++;
//             }
//             else
//             {
//                 high = mid-1;
//                 count++;
//             }
//         }
//         return -1;
//     }
// }