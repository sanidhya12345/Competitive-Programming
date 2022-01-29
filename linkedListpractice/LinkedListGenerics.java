package linkedListpractice;
import java.util.*;
public class LinkedListGenerics<T>{
      private ListNode<T> head=null;
      public static class ListNode<T>{
        private T data;
        private ListNode<T> next;
        public ListNode(T data){
          this.data=data;
          this.next=null;
        }
      }
      public void addNode(T data){
        ListNode<T> newNode=new ListNode<>(data);
        if (head==null) {
          head=newNode;
        }
        else{
          ListNode<T> currentNode=head;
          while (currentNode.next!=null) {
              currentNode=currentNode.next;
          }
          currentNode.next=newNode;
        }
      }
      public void deleteNode(){
        if (head==null) {
          System.out.println("list is empty...");
        }
        else{
          ListNode<T> curNode=head;
          while(curNode.next.next!=null){
            curNode=curNode.next;
          }
          curNode.next=null;
        }
      }

      public void deleteDups(){
        HashSet<T> set=new HashSet<>();
        ListNode previous=null;
        while(head!=null){
          if(set.contains(head.data)){
            previous.next=head.next;
          }
          else{
            set.add(head.data);
            previous=head;
          }
        head=head.next;
        }
      }
      public void traverseList(){
        if (head==null) {
          System.out.println("list is empty...");
        }
        else{
          ListNode<T> curNode;
          for (curNode=head;curNode!=null ;curNode=curNode.next ) {
            System.out.print(curNode.data+" ");
          }
          System.out.println();
        }
      }
      public static void main(String[] args) {
        LinkedListGenerics<Integer> linkedlist=new LinkedListGenerics<>();
        linkedlist.addNode(10);
        linkedlist.addNode(20);
        linkedlist.addNode(30);
        linkedlist.addNode(40);
        linkedlist.traverseList();
        linkedlist.deleteDups();
        linkedlist.traverseList();
        linkedlist.deleteNode();
        linkedlist.traverseList();
      }
}
