package QueuePractice;

public class QueueUsingLinkedList{
  private Node front=null;
  private Node rear=null;
  public static class Node{
    private Node next;
    private int data;
    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public void enqueue(int data){
    Node queueNode=new Node(data);
    if (front==null || rear==null) {
      front=queueNode;
      rear=queueNode;
    }
    else{
      Node curNode=rear;
      while(curNode.next!=null){
        curNode=curNode.next;
      }
      curNode.next=queueNode;
    }
  }
  public void traverse(){
    if (front==null) {
      System.out.println("Queue is empty...");;
    }
    else{
      Node curNode;
      for (curNode=front;curNode!=null ;curNode=curNode.next ) {
        System.out.print(curNode.data+" ");
      }
      System.out.println();
    }
  }
  public void dequeue(){
    if (front==null) {
      System.out.println("Queue is empty...");
    }
    else{
      System.out.println("Deleted Data:- "+front.data);
      front=front.next;
    }
  }
  public static void main(String[] args) {
    QueueUsingLinkedList queueUsingLinkedList=new QueueUsingLinkedList();
    queueUsingLinkedList.enqueue(10);
    queueUsingLinkedList.enqueue(20);
    queueUsingLinkedList.enqueue(30);
    queueUsingLinkedList.enqueue(40);
    queueUsingLinkedList.traverse();
    queueUsingLinkedList.dequeue();
    queueUsingLinkedList.traverse();
  }
}
