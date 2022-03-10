// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}

// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        if(node==null || node.next==null){
            return node;
        }
        Node cur=node;
        for(int i=0;i<k-1 && cur!=null && cur.next!=null ;i++){
            cur=cur.next;
        }
        Node temp1=reverse(cur.next,k);
        Node temp2=node;
        cur.next=null;
        node=helper(node);
        temp2.next=temp1;
        return node;
        
    }
    public static Node helper(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node temp=helper(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }
}

