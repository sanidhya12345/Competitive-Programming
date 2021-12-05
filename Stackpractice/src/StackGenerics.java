package Stackpractice.src;

public class StackGenerics<T>
{
  private StackNode<T> top=null;
  public static class StackNode<T>{
    private T data;
    private StackNode<T> next;

    public StackNode(T data){
      this.data=data;
      this.next=null;
    }
  }
  public void push(T data){
    StackNode<T> newNode=new StackNode<>(data);
    newNode.data=data;
    newNode.next=top;
    top=newNode;
  }
  public void traverse(){
    if (top==null) {
      System.out.println("Stack is empty...");
    }
    StackNode<T> curreNode;
    for (curreNode=top;curreNode!=null ;curreNode=curreNode.next ) {
      System.out.print(curreNode.data+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    StackGenerics<Integer> staGenerics=new StackGenerics<>();
    staGenerics.push(10);
    staGenerics.push(20);
    staGenerics.push(30);
    staGenerics.push(40);
    staGenerics.traverse();
  }
}
