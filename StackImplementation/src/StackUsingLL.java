public class StackUsingLL<T> {
    private Node<T> head;
    private int size;


    int size(){
        return size;
    }

    T pop() throws StackEmptyException {
        if(head==null){
            throw new StackEmptyException("Stack is Empty..");
        }
        T tempdata= head.data;
        head=head.next;
        return tempdata;
    }

    boolean isEmpty(){
        return size()==0;
    }

    void push(T element){
        Node<T> newNode =new Node<>(element);
        newNode.next=head;
        head=newNode;
        size++;
    }

    T top() throws StackEmptyException {
        if(size()==0){
            throw new StackEmptyException("Stack is Empty..");
        }
        return head.data;
    }
}
