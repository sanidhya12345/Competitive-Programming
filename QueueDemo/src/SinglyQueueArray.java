import java.util.Scanner;

public class SinglyQueueArray
{
    int ar[];
    int front,rear;
    SinglyQueueArray()
    {
        ar=new int[5];
        front=-1;
        rear=-1;
    }
    void insert()
    {
        if (rear==4)
        {
            System.out.println("queue is full");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc2=new Scanner(System.in);
            int data= sc2.nextInt();
            if (front==-1)
            {
                front=0;
            }
            rear=rear+1;
            ar[rear]=data;
            System.out.println("data inserted......");
        }
    }
    void delete()
    {
        if (front==-1 || rear==-1)
        {
            System.out.println("queue empty");
        }
        else
        {
            if (front==rear)
            {
                System.out.println("deleted element: "+ar[front]);
                front-=1;
                rear-=1;
            }
            else
            {
                System.out.println("deleted :"+ar[front]);
                front+=1;
            }

        }
    }
    void traverse()
    {
        if (front==-1 | rear==-1)
        {
            System.out.println("Queue empty...");
        }
        else
        {
            System.out.println("<------------singly queue--------->");
            for (int i = front; i <=rear ; i++)
            {
                System.out.println(" "+ar[i]);
            }
        }
    }
    void peak()
    {
        if (front==-1 || rear==-1)
        {
            System.out.println("queue empty");
        }
        else
        {
            System.out.println("last element: "+ar[rear]);
        }
    }
    void poll()
    {
        if (front==-1 || rear==-1)
        {
            System.out.println("queue empty");
        }
        else
        {
            System.out.println("first element: "+ar[front]);
        }
    }
    public static void main(String[] args)
    {
        SinglyQueueArray obj=new SinglyQueueArray();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");
            System.out.println("Press 5 for peak");
            System.out.println("Press 6 for poll");
            System.out.println("Enter ur choice");
            int ch= sc.nextInt();
            switch(ch)
            {
                case 1 ->obj.insert();
                case 2 ->obj.delete();
                case 3 ->obj.traverse();
                case 4 ->System.exit(0);
                case 5 ->obj.peak();
                case 6 -> obj.poll();
                default -> System.out.println("Wrong choice");
            }
        }
    }
}
