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

    public  void addNode(int data) {
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
        linkedList.addNode(12);
        linkedList.addNode(13);
        linkedList.addNode(14);
        linkedList.addNode(15);
        linkedList.addNode(16);
        linkedList.printLL();
        linkedList.addNode(17);
        linkedList.addNode(18);
        linkedList.printLL();
    }
}
