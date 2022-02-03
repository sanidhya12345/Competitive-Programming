import java.util.Scanner;
/*
* public class Node{
    Node next;
    int data;
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class LinkedList{
    private Node head;
    private Node tail;
    public void add(int x)
    {
        Node node = new Node(x);
        if(this.head==null)
        {
            this.head = node;
            this.tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        return;
    }
    public void setHead(Node head)
    {
        this.head = head;
    }
    public void display()
    {
        Node temp = this.head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void reverse(){
        Node curr = this.head;
        Node prev=null;
        while(curr!=null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        this.head = prev;
    }
    public Node getHead()
    {
        return this.head;
    }
}
public class Main {
    public static LinkedList sum(LinkedList l1,LinkedList l2)
    {
        l1.reverse();
        l2.reverse();
        Node headA = l1.getHead();
        Node headB = l2.getHead();
        Node head = new Node(-1);
        Node temp = head;
        LinkedList l = new LinkedList();
        int c=0;
        while(headA!=null && headB!=null)
        {
            int d = headA.data + headB.data + c;
            if(d>9)
            {
                c = d/10;
                d=d%10;

            }
            else{
                c=0;
            }
            temp.next = new Node(d);
            temp = temp.next;
            headA = headA.next;
            headB = headB.next;
        }
        if(headA!=null)
        {

            while(headA!=null)
            {
                int d = headA.data + c;
                if(d>9)
                {
                    c = d/10;
                    d=d%10;

                }
                else{
                    c=0;
                }
                temp.next = new Node(d);
                temp = temp.next;
                headA = headA.next;
            }
        }
        if(headB!=null)
        {
// 			int d = headB.data + c;
// 			System.out.print(d+" ");
            while(headB!=null)
            {
                int d = headB.data + c;
                if(d>9)
                {
                    c = d/10;
                    d=d%10;

                }
                else{
                    c=0;
                }
                // System.out.println(c);
                temp.next = new Node(d);
                temp = temp.next;
                headB = headB.next;
            }
        }

        if(c>0)
        {
            temp.next = new Node(c);
            temp = temp.next;
        }
        head = head.next;
        l.setHead(head);
        l.reverse();
        return l;
    }
    public static LinkedList merge(LinkedList l1,LinkedList l2)
    {
        Node headA = l1.getHead();
        Node headB = l2.getHead();
        if(headA==null)
            return l2;
        if(headB==null)
            return l1;
        Node head=null,temp=null;
        if(headA.data<=headB.data)
        {
            head = headA;
            headA = headA.next;
        }
        else{
            head = headB;
            headB = headB.next;
        }
        temp = head;
        while(headA!=null && headB!=null)
        {
            if(headA.data<=headB.data)
            {
                temp.next = headA;
                temp = headA;
                headA = headA.next;
            }
            else{
                temp.next = headB;
                temp = headB;
                headB = headB.next;
            }
        }
        if(headA!=null)
        {
            temp.next = headA;
        }
        if(headB!=null)
        {
            temp.next = headB;
        }
        LinkedList l = new LinkedList();
        l.setHead(head);
        return l;
    }
public static class MergeSortedLinkedList {
    public static LinkedList sum(LinkedList l1, LinkedList l2) {
        l1.reverse();
        l2.reverse();
        Node headA = l1.getHead();
        Node headB = l2.getHead();
        Node head = new Node(-1);
        Node temp = head;
        LinkedList l = new LinkedList();
        int c = 0;
        while (headA != null && headB != null) {
            int d = headA.data + headB.data + c;
            if (d > 9) {
                c = d / 10;
                d = d % 10;

            } else {
                c = 0;
            }
            temp.next = new Node(d);
            temp = temp.next;
            headA = headA.next;
            headB = headB.next;
        }
        if (headA != null) {

            while (headA != null) {
                int d = headA.data + c;
                if (d > 9) {
                    c = d / 10;
                    d = d % 10;

                } else {
                    c = 0;
                }
                temp.next = new Node(d);
                temp = temp.next;
                headA = headA.next;
            }
        }
        if (headB != null) {
// 			int d = headB.data + c;
// 			System.out.print(d+" ");
            while (headB != null) {
                int d = headB.data + c;
                if (d > 9) {
                    c = d / 10;
                    d = d % 10;

                } else {
                    c = 0;
                }
                // System.out.println(c);
                temp.next = new Node(d);
                temp = temp.next;
                headB = headB.next;
            }
        }

        if (c > 0) {
            temp.next = new Node(c);
            temp = temp.next;
        }
        head = head.next;
        l.setHead(head);
        l.reverse();
        return l;
    }

    public static LinkedList merge(LinkedList l1, LinkedList l2) {
        Node headA = l1.getHead();
        Node headB = l2.getHead();
        if (headA == null)
            return l2;
        if (headB == null)
            return l1;
        Node head = null, temp = null;
        if (headA.data <= headB.data) {
            head = headA;
            headA = headA.next;
        } else {
            head = headB;
            headB = headB.next;
        }
        temp = head;
        while (headA != null && headB != null) {
            if (headA.data <= headB.data) {
                temp.next = headA;
                temp = headA;
                headA = headA.next;
            } else {
                temp.next = headB;
                temp = headB;
                headB = headB.next;
            }
        }
        if (headA != null) {
            temp.next = headA;
        }
        if (headB != null) {
            temp.next = headB;
        }
        LinkedList l = new LinkedList();
        l.setHead(head);
        return l;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();

            LinkedList l1 = new LinkedList();
            for (int i = 0; i < n; i++) {
                l1.add(sc.nextInt());
            }
            int m = sc.nextInt();
            LinkedList l2 = new LinkedList();
            for (int i = 0; i < m; i++) {
                l2.add(sc.nextInt());
            }
            LinkedList l = merge(l1, l2);
            l.display();
        }
    }
}
*/
