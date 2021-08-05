import java.util.*;
class Nodee{
    int rollno;
    Nodee previous;
    Nodee next;
}
public class DoublyLinkedList
{
    Nodee start;
    DoublyLinkedList()
    {
      start=null;
    }
    void addnode()
    {
        System.out.println("Enter roll number");
        Scanner sc2=new Scanner(System.in);
        int rn=sc2.nextInt();
        Nodee newnode=new Nodee();
        newnode.rollno=rn;
        newnode.previous=null;
        newnode.next=null;
        if (start==null)
        {
            start=newnode;
        }
        else
        {
            Nodee current=start;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
            newnode.previous=current;
        }
        System.out.println("data inserted......");
    }
    void deletenodebegin()
    {
        if (start==null)
        {
            System.out.println("doubly list empty");
        }
        else
        {
            System.out.println("deleted "+start.rollno);
            start=start.next;
            start.previous=null;
        }
    }
    void deletenodelast()
    {
        if (start==null)
        {
            System.out.println("douubly list empty");
        }
        else
        {
           Nodee current=start;
            while(current.next.next!=null)
            {
                current=current.next;
            }
            current.next=null;
        }
    }
    void deletevaluenode()
    {
        if (start==null)
        {
            System.out.println("doubly list empty");
        }
        else
        {

        }
    }
    void traversenode()
    {
        if(start==null)
        {
            System.out.println("doubly List empty");
        }
        else
        {
            //forward
            System.out.println("-----------forward-----------");
            Nodee current;
            for (current=start;current.next!=null;current=current.next)
            {
                System.out.print(current.rollno+" ");
            }
            System.out.println(current.rollno);
            //1
            // System.out.println(" "+current.rollno);
            //backward
            System.out.println("-----------backward-----------");
            Nodee last;
            for (last=current;last!=null;last=last.previous)
            {
                System.out.print(last.rollno+" ");
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
            System.out.println("Enter the searching element");
            Scanner sc3=new Scanner(System.in);
            int sea=sc3.nextInt();
            int count=0;
            for (Nodee current=start;current!=null;current=current.next)
            {
                if (current.rollno==sea)
                {
                    count++;
                    break;
                }
            }
            if (count>0)
            {
                System.out.println("found");
            }
            else
            {
                System.out.println("not found");
            }

        }
    }
    public static void main(String[] args) {
        DoublyLinkedList obj=new DoublyLinkedList();
        while(true)
        {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete begin");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for search");
            System.out.println("Press 5 for exit");
            System.out.println("Press 6 for delete last");
            System.out.println("Press 7 for delete by value");
            System.out.println("Enter choice");
            Scanner sc=new Scanner(System.in);
            int ch= sc.nextInt();
            switch (ch) {
                case 1 -> obj.addnode();
                case 2 -> obj.deletenodebegin();
                case 3 -> obj.traversenode();
                case 4 -> obj.searchnode();
                case 5 -> System.exit(0);
                case 6 -> obj.deletenodelast();
                case 7 -> obj.deletevaluenode();
                default -> System.out.println("wrong choice");
            }
        }
    }
}
