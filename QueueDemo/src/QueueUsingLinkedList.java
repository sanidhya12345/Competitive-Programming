import java.util.Scanner;

class QueueNode<T>{
    public T data;
    public QueueNode<T> next;

    public QueueNode(T data){
        this.data=data;
    }
}

public class QueueUsingLinkedList<T> {
    public QueueNode<T> front=null;
    public QueueNode<T> rear=null;
    public void insert(T data){
        QueueNode<T> newnode=new QueueNode<>(data);
        newnode.next=null;
        if (front==null || rear==null)
        {
            front=newnode;
            rear=newnode;
        }
        else
        {
            QueueNode<T> current =front;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
    }
    public void delete(){
        if (front==null)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.out.println("deleted :"+front.data);
            front=front.next;
        }
    }
    public void traverse() {
        if (front == null || rear == null) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("------------elements-------------");
            for (QueueNode<T> current = front; current != null; current = current.next) {
                System.out.print(" " + current.data);
            }
        }
    }
    public static void main(String[] args) {
        QueueUsingLinkedList<Integer> queueUsingLinkedList=new QueueUsingLinkedList<>();
    }
}
