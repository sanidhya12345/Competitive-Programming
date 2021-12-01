package linkedListpractice;

public class LinkedList {
    private Node head=null;
    private int sizeOfLL=0;
    private class Node{
        private int data;
        private Node next;

        public  Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public  void addNodeAtLast(int data) {
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
        }
        else {
            Node currentNode=head;
            while (currentNode.next!=null) {
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        }

    }
    public void addNodeAtBegin(int data) {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void deleteNodeAtLast() {
        if (head==null) {
            System.out.println("List is empty..");
        }
        else {
            Node curNode=head;
            while (curNode.next.next!=null) {
                curNode=curNode.next;
            }
            curNode.next=null;
        }
    }
    public void deleteNodeAtBegin() {
        if (head==null) {
            System.out.println("List is empty...");
        }
        else {
            Node tempNode=head;
            head=head.next;
            tempNode.next=null;
        }
    }
    public void printLL() {
        //Node lastData=null;
        if (head==null) {
            System.out.println("Linked List is empty....");
        }
        else {
            Node currentNode;
            for (currentNode=head; currentNode!=null; currentNode=currentNode.next) {
                System.out.print(currentNode.data+" ");
                sizeOfLL++;

            }
            System.out.println();
        }
        System.out.println("size of ll:-"+sizeOfLL);
        //System.out.println("Size of Linked List:- "+sizeOfLL);
        //System.out.println("Last element added:- "+lastData.data);
        sizeOfLL=0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedList linkedList=new LinkedList();
        linkedList.addNodeAtLast(12);
        linkedList.addNodeAtLast(13);
        linkedList.addNodeAtLast(14);
        linkedList.addNodeAtLast(15);
        linkedList.addNodeAtLast(16);
        linkedList.printLL();
        linkedList.addNodeAtLast(17);
        linkedList.addNodeAtLast(18);
        linkedList.printLL();
        linkedList.deleteNodeAtLast();
        linkedList.printLL();
        linkedList.deleteNodeAtBegin();
        linkedList.printLL();
        linkedList.addNodeAtBegin(10);
        linkedList.printLL();

    }
}
