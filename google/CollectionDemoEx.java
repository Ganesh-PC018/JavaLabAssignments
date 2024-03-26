package google;

    import java.util.*;
    
    class CollectionsDemoEx {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = sc.nextInt();
                Solution2 g = new Solution2();
                ArrayList<Integer> ans = g.duplicates(a, n);
                for (Integer val : ans) System.out.print(val + " ");
                System.out.println();
                sc.close();
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution2 {
        public ArrayList<Integer> duplicates(int arr[], int n) {
            // code here
            Arrays.sort(arr);
            ArrayList<Integer> ar = new ArrayList<Integer>();
            ArrayList<Integer> result = new ArrayList<Integer>();
           for(int i=0;i<n;i++)
           {
              ar.add(arr[i]);

           }
            Iterator<Integer> l = ar.iterator();
            Integer prev=-1;
            
            if(l.hasNext())
            {
                prev = l.next();
            }
            while(l.hasNext())
            {
                Integer temp = l.next();
                if(prev == temp && !result.contains(temp))
                {
                    result.add(prev);
                }
            }
            if(result.size() == 0)
            {
                result.add(-1);
            }
            return result;
        }
    }
    
