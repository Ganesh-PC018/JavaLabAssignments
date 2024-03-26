package google;

//{ Driver Code Starts
    import java.util.Scanner;

    // Node Class
    class Node {
        int data;
        Node next;
    
        Node(int val) {
            data = val;
            next = null;
        }
    }
    
    // Linked List Class
    class LinkedList {
        Node head;
        Node tail;
    
        LinkedList() {
            head = null;
            tail = null;
        }
    
        // creates a new node with given value and appends it at the end of the linked list
        void insert(int val) {
            if (head == null) {
                head = new Node(val);
                tail = head;
            } else {
                tail.next = new Node(val);
                tail = tail.next;
            }
        }
    }
    
    
    public class LinkedListSub {
        static void printList(Node n) 
        {
            while (n != null) {
                System.out.print(n.data);
                n = n.next;
            }
            System.out.println();
        }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
    
            for (int i = 0; i < t; ++i) {
                int n = sc.nextInt();
                LinkedList LL1 = new LinkedList();
                String l1 = sc.next();
                for (int j = 0; j < n; ++j) {
                    int x = Character.getNumericValue(l1.charAt(j));
                    LL1.insert(x);
                }
    
                int m = sc.nextInt();
                LinkedList LL2 = new LinkedList();
                String l2 = sc.next();
                for (int j = 0; j < m; ++j) {
                    int x = Character.getNumericValue(l2.charAt(j));
                    LL2.insert(x);
                }
    
                Solution ob = new Solution();
                Node res = ob.subLinkedList(LL1.head, LL2.head);
                printList(res);
            }
            sc.close();
        }
    }
    
    // } Driver Code Ends
    
    
    /*
    
    Definition for singly Link List Node
    class Node
    {
        int data;
        Node next;
    
        Node(int x){
            data = x;
            next = null;
        }
    }
    
    You can also use the following for printing the link list.
    Node.printList(Node node);
    */
    
    class Solution {
        public Node subLinkedList(Node head1, Node head2) {
            // code here
            String s1 = "";
            String s2 = "";
            Node p = head1;
            Node q = head2;
            while(p != null)
            {
                s1 = s1 +p.data;
                p = p.next;
            }
            while(q != null)
            {
                s2 = s2 + q.data;
                q = q.next;
            }
            long l1 = Long.parseLong(s1);
            long l2 = Long.parseLong(s2);
            long r =-0l;
           
            if(l1 > l2)
            {
                 r= l1-l2;
            }
           else
           {
               r = l2-l1;
           }
           long temp =r;
           int flag =0;
           Node answer = new Node(0);
           while(temp >= 0)
           {
               int rem = (int)temp%10;
               if(flag ==0)
               {
               answer.data = rem;
               answer.next = null;
               flag =1;
               }
               else
               {
               Node another = new Node(rem);
               another.next = answer;
               answer = another;
               }
              temp = temp/10;
           }
           return answer;
        }
    }
    
            
    