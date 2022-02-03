/*
* import java.util.*;
public class Main {
	node head = null;
    static class node {
        int val;
        node next;

        public node(int val)
        {
            this.val = val;
        }
    }

    node sortedMerge(node a, node b)
    {
        node result = null;
        if (a == null)
            return b;
        if (b == null)
            return a;

        if (a.val <= b.val) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    node mergeSort(node h)
    {
        if (h == null || h.next == null) {
            return h;
        }
        node middle = getMiddle(h);
        node nextofmiddle = middle.next;
        middle.next = null;
        node left = mergeSort(h);
        node right = mergeSort(nextofmiddle);
        node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }
    public static node getMiddle(node head)
    {
        if (head == null)
            return head;

        node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void push(int new_data)
    {
        node new_node = new node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList(node headref)
    {
        while (headref != null) {
            System.out.print(headref.val + " ");
            headref = headref.next;
        }
    }

    public static void main(String[] args)
    {

        Main li = new Main();
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			li.push(arr[i]);
		}
        li.head = li.mergeSort(li.head);
        li.printList(li.head);
    }
}*/