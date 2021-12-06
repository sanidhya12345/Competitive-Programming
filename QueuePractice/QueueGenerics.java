package QueuePractice;

public class QueueGenerics<T>{
  private Queue<T> front=null;
  private Queue<T> rear=null;
  public static class Queue<T>{
    private T data;
    private Queue<T> next;
    public Queue(T data){
      this.data=data;
      this.next=null;
    }
  }
  public Queue<T> enqueue(T data){
    Queue<T> queueNode=new Queue<>(data);
    if (front==null || rear==null) {
      front=queueNode;
      rear=queueNode;
    }
    else{
      Queue<T> curNode=rear;
      while(curNode.next!=null){
        curNode =curNode.next;
      }
      curNode.next=queueNode;
    }
    return queueNode;
  }

  public void dequeue(){
    if (front==null) {
      System.out.println("queue is empty...");
    }
    else{
      front=front.next;
    }
  }
  public void traverse(){
    if(front==null){
      System.out.println("Queue is empty...");
    }
    else{
      for (Queue<T> node=front;node!=null ;node=node.next) {
        System.out.print(node.data+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    QueueGenerics<String> queueGenerics=new QueueGenerics<>();
    queueGenerics.enqueue("abc");
    queueGenerics.enqueue("xyz");
    queueGenerics.enqueue("pqr");
    queueGenerics.traverse();
    queueGenerics.dequeue();
    queueGenerics.traverse();
  }
}
