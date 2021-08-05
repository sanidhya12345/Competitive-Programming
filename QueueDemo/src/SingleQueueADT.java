interface ADT
{
    abstract void insert(int data);
    abstract void traverse();

}
class Node3
{
    int data;
    Node3 next;
}
class SingleQueueADT implements ADT
{
    Node3 front,rear;
    SingleQueueADT()
    {
        front=null;
        rear=null;
    }
    @Override
    public void insert(int item)
    {
        Node3 newnode=new Node3();
        newnode.data=item;
        newnode.next=null;
        if (front==null || rear==null)
        {
            front=newnode;
            rear=newnode;
        }
        else
        {
            Node3 current=front;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
    }

    @Override
    public void traverse() {
        if (front==null || rear==null)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            for (Node3 curr=front;curr!=null;curr=curr.next)
            {
                System.out.print(curr.data+" ");
            }
        }
    }
}
class Main
{
    public static void main(String[] args) {
        SingleQueueADT obj=new SingleQueueADT();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.traverse();
    }
}
