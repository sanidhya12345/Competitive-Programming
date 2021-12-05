package Stackpractice.src;
public class StackUsingLinkedList {
    private  Node top=null;
    public static class Node{
        private int data;
        private Node next;

        public  Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public void push(int data) {
        Node newNode=new Node(data);
        newNode.data=data;
        newNode.next=top;
        top=newNode;
    }

    public void traverse() {
        if (top==null) {
            System.out.println("Stack is empty...");
        }
        Node curreNode;
        for (curreNode=top; curreNode!=null; curreNode=curreNode.next) {
            System.out.print(curreNode.data+" ");
        }
        System.out.println();
    }
    public void pop() {
        if (top==null) {
            System.out.println("Stack is empty...");
        }
        System.out.println("Element Deleted:- "+top.data);
        top=top.next;
    }
    public void getMin(){
      int min=top.data;
      for (Node curNode=top;curNode!=null ;curNode=curNode.next) {
        if (min>curNode.data) {
          min=curNode.data;
        }
      }
      System.out.println(min);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StackUsingLinkedList stackUsingLinkedList=new StackUsingLinkedList();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(40);
        stackUsingLinkedList.traverse();
        stackUsingLinkedList.pop();
        stackUsingLinkedList.traverse();
        stackUsingLinkedList.getMin();
    }

}
