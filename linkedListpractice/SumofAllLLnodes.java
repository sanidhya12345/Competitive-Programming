package linkedListpractice;

public class SumofAllLLnodes {
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
    public int sumOfAllNodes() {
        Node currNode;
        int sum=0;
        for (currNode=head; currNode!=null; currNode=currNode.next) {
            sum+=currNode.data;
        }
        return sum;
    }
    public static void main(String[] args) {
        SumofAllLLnodes sumofAllLLnodes=new SumofAllLLnodes();
        sumofAllLLnodes.addNodeAtLast(12);
        sumofAllLLnodes.addNodeAtLast(2);
        sumofAllLLnodes.addNodeAtLast(11);
        sumofAllLLnodes.addNodeAtLast(7);
        int result=sumofAllLLnodes.sumOfAllNodes();
        System.out.println(result);
    }
}
