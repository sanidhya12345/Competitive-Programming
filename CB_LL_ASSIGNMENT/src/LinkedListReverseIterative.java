import java.util.Scanner;

public class LinkedListReverseIterative {
    static class Node {
        public int data;
        public Node next;

        public Node(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class LinkedList {
        public Node head;

        public LinkedList() {
            this.head = null;
        }

        public void insertNode(int nodeData) {
            Node node = new Node(nodeData);

            if (this.head != null) {
                node.next = head;
            }
            this.head = node;
        }
    }

    public static void printSinglyLinkedList(Node node){
        while (node != null) {
            System.out.print(String.valueOf(node.data) + " ");
            node = node.next;
        }
    }
    static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        LinkedList llist = new LinkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            llist.insertNode(arr[i]);
        }
        Node llist1 = reverse(llist.head);
        printSinglyLinkedList(llist1);
    }
}
