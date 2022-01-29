package QueueUsingLinkedList;
public class QueueUsingLL<T>{
    private ListNode<T> front=null;
    private ListNode<T> rear=null;;
    int size=0;
    public static class ListNode<T>{
      private T data;
      private ListNode<T> next;
      public ListNode(T data){
        this.data=data;
        this.next=null;
      }
  }

    int size(){
      return size;
    }

    boolean isEmpty(){
      return size==0;
    }

    T front() throws QueueEmptyException {
      if(size==0){
        throw new QueueEmptyException();
      }
      return front.data;
    }

    void enqueue(T data){
      ListNode<T> newNode=new ListNode<>(data);
      if(rear==null){
        front=newNode;
        rear=newNode;
      }
      else{
        rear.next=newNode;
        rear=newNode;
      }
      size++;
    }

    T dequeue() throws QueueEmptyException{
      if(size==0){
        throw new QueueEmptyException();
      }
      T temp=front.data;
      front=front.next;
      if(size==1){
        rear=null;
      }
      size--;

      return temp;
    }
  public static void main(String[] args) {

  }
}
