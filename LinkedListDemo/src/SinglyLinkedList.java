import java.util.*;
class Node{
    int rollno;
    Node next;
}
public class SinglyLinkedList {
    Node start;
    SinglyLinkedList()
    {
        start=null;
    }
    void addnode()
    {
        System.out.println("Enter the rollnumber");
        Scanner sc2=new Scanner(System.in);
        int rn=sc2.nextInt();

        Node newnode=new Node();
        newnode.rollno=rn;
        newnode.next=null;
        if (start==null)
        {
            start=newnode;
        }
        else
        {
            Node current=start;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
        System.out.println("data inserted....");
    }
    void deletenode()
    {
        if (start==null)
        {
            System.out.println("List empty");
        }
        else
        {
            Node current=start;
            while(current.next.next!=null)
            {
                current=current.next;
            }
            current.next=null;
        }
    }
    void traversenode()
    {
        if (start==null)
        {
            System.out.println("List empty");
        }
        else
        {
            Node current;
            for (current=start;current!=null;current=current.next)
            {
                System.out.print(current.rollno+" ");
            }
            System.out.println();
        }
    }
    void searchnode()
    {
        if (start==null)
        {
            System.out.println("List empty");
        }
        else
        {
            System.out.println("Enter searching element");
            Scanner sc3=new Scanner(System.in);
            int sea=sc3.nextInt();

            Node current;
            int count=0;
            for ( current = start; current!=null; current=current.next)
            {
                if (current.rollno==sea)
                {
                    count++;
                    break;
                }
            }
            if (count>0)
            {
                System.out.println("roll number found....");
            }
            else
            {
                System.out.println("roll number not found...");
            }
        }
    }
    public static void main(String[] args)
    {
        SinglyLinkedList obj=new SinglyLinkedList();
        while(true)
        {
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for search");
            System.out.println("press 5 for exit");
            System.out.println("Enter ur choice");
            Scanner sc=new Scanner(System.in);
            int ch= sc.nextInt();
            switch(ch)
            {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.deletenode();
                    break;
                case 3:
                    obj.traversenode();
                    break;
                case 4:
                    obj.searchnode();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("wrong choice");
            }
        }
    }
}
