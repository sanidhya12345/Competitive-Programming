interface ADT1
{
    abstract void insert(int data);
    abstract void delete();
    abstract void traverse();
    abstract boolean search(int sea);
    abstract boolean isEmpty();
}
class Node4
{
    int item;
    Node4 next;
}
class QueueAbstractDemo implements ADT1 {
    Node4 front, rear;

    QueueAbstractDemo() {
        front = null;
        rear = null;
    }

    @Override
    public void insert(int data) {
        Node4 newnode = new Node4();
        newnode.item = data;
        newnode.next = null;
        if (front == null || rear == null) {
            front = newnode;
            rear = newnode;
        } else {
            Node4 current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }

    @Override
    public void delete() {
        if (front == null) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("deleted :" + front.item);
            front = front.next;
        }
    }

    @Override
    public void traverse() {
        if (front == null || rear == null) {
            System.out.println("Queue is empty");
        } else {
            Node4 current;
            for (current = front; current != null; current = current.next) {
                System.out.println(current.item + " ");
            }
        }
    }

    @Override
    public boolean search(int sea) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (front == null || rear == null) {
            return false;
        }
        return true;
    }

    static class Main1 {
        public static void main(String[] args) {
            QueueAbstractDemo obj = new QueueAbstractDemo();
            obj.insert(10);
            obj.insert(20);
            obj.insert(30);
            obj.traverse();
            obj.isEmpty();
            obj.delete();
            obj.traverse();
        }
    }
}
