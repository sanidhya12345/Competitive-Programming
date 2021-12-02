package StackDemo.src;

import java.util.Scanner;
class Nodee
{
    int data;
    Nodee next;
}
public class StackExampleLinkedList {
    Nodee top;
    StackExampleLinkedList()
    {
        top=null;
    }
    void push()
    {
        System.out.println("Enter data");
        Scanner sc2=new Scanner(System.in);
        int newitem= sc2.nextInt();

        Nodee newnode=new Nodee();
        newnode.data=newitem;
        newnode.next=top;

        top=newnode;
        System.out.println("data inserted...");
    }
    void pop()
    {
        if (top==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("deleted element :"+top.data);
            top=top.next;
        }
    }
    void traverse()
    {
        if (top==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            Nodee current;
            for (current=top;current!=null;current=current.next)
            {
                System.out.println(current.data);
            }
        }
    }
    void peek(){
        if(top==null){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("peek:-"+top.data);
        }
    }
    public static void main(String[] args)
    {
        StackExampleLinkedList obj=new StackExampleLinkedList();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("press 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for peek");
            System.out.println("press 5 for exit");

            System.out.println("Enter the choice");
            int ch= sc.nextInt();
            switch (ch)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    obj.peek();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }
    }
}
