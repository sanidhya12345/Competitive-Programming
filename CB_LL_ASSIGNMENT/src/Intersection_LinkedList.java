import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public LinkedList(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    // O(1)
    public int size() {
        return this.size;
    }

    // O(1)
    public boolean isEmpty() {
        return this.size() == 0;
    }

    // O(1)
    public int getFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty.");
        }

        return this.head.data;
    }

    // O(1)
    public int getLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty.");
        }

        return this.tail.data;
    }
    public Node getHead()
    {
        return this.head;
    }

    // O(N)
    public int getAt(int idx) throws Exception {
        Node temp = this.getNodeAt(idx);
        return temp.data;
    }

    // O(N)
    private Node getNodeAt(int idx) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty");
        }

        if (idx < 0 || idx >= this.size()) {
            throw new Exception("Invalid arguments");
        }

        Node retVal = this.head;
        for (int i = 0; i < idx; i++) {
            retVal = retVal.next;
        }

        return retVal;
    }

    // O(1)
    public void addFirst(int data) {
        Node node = new Node(data, this.head);

        if (this.size() == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.head = node;
        }

        this.size++;
    }

    // O(1)
    public void addLast(int data) {
        Node node = new Node(data, null);

        if (this.size() == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }

        this.size++;
    }

    // O(n)
    public void addAt(int idx, int data) throws Exception {
        if (idx < 0 || idx > this.size()) {
            throw new Exception("Invalid arguments");
        }

        if (idx == 0) {
            this.addFirst(data);
        } else if (idx == this.size()) {
            this.addLast(data);
        } else {
            Node nm1 = this.getNodeAt(idx - 1);
            Node n = nm1.next;

            Node node = new Node(data, n);
            nm1.next = node;

            this.size++;
        }
    }

    // O(1)
    public int removeFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty");
        }

        int retVal = this.head.data;

        if (this.size() == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }

        this.size--;
        return retVal;
    }

    // O(n)
    public int removeLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty");
        }

        int retVal = this.tail.data;

        if (this.size() == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node sm2 = this.getNodeAt(this.size() - 2);
            sm2.next = null;
            this.tail = sm2;
        }

        this.size--;
        return retVal;
    }

    // O(n)
    public int removeAt(int idx) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty");
        }

        if (idx < 0 || idx >= this.size()) {
            throw new Exception("Invalid arguments");
        }

        if (idx == 0) {
            return this.removeFirst();
        } else if (idx == this.size() - 1) {
            return this.removeLast();
        } else {
            Node nm1 = this.getNodeAt(idx - 1);
            Node n = nm1.next;
            Node np1 = n.next;

            nm1.next = np1;
            this.size--;

            return n.data;
        }
    }

    // O(n)
    public void display() {
        Node node = this.head;

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

        //System.out.println("END");
    }
    public void reverse_DI() {
        Node curr = this.head,prev=null;
        while(curr!=null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        this.head = prev;
        this.tail = this.head;
    }

}
public class Intersection_LinkedList{
    public static Node getIntersectionNode(Node headA,Node headB)
    {
        Set<Integer> s = new HashSet<>();
        Node temp=headA;
        while(temp!=null)
        {
            s.add(temp.data);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null && !s.contains(temp.data))
        {
            temp=temp.next;
        }


        return temp;
    }
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        //int M = scn.nextInt();


        LinkedList list = new LinkedList();

        for (int i = 0; i < N; i++) {
            list.addLast(scn.nextInt());
        }
        int m = scn.nextInt();
        //int M = scn.nextInt();


        LinkedList list1 = new LinkedList();

        for (int i = 0; i < m; i++) {
            list1.addLast(scn.nextInt());
        }
        Node headA =list.getHead();
        Node headB = list1.getHead();
        Node ans = getIntersectionNode(headA,headB);
        if(ans==null)
            System.out.println(-1);
        else
            System.out.println(ans.data);
        // list.display();
    }
}