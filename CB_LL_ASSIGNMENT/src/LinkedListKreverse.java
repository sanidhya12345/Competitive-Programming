/**
 * import java.util.Scanner;
 *
 * public class Main {
 * 	Node head;
 *     class Node {
 *         int data;
 *         Node next;
 *         Node(int d)
 *         {
 *             data = d;
 *             next = null;
 *         }
 *     }
 *
 *     Node reverse(Node head, int k)
 *     {
 *         if(head == null)
 *           return null;
 *         Node current = head;
 *         Node next = null;
 *         Node prev = null;
 *
 *         int count = 0;
 *         while (count < k && current != null) {
 *             next = current.next;
 *             current.next = prev;
 *             prev = current;
 *             current = next;
 *             count++;
 *         }
 *
 *         if (next != null)
 *             head.next = reverse(next, k);
 *
 *         return prev;
 *     }
 *     public void push(int new_data)
 *     {
 *         Node new_node = new Node(new_data);
 *         new_node.next = head;
 *         head = new_node;
 *     }
 *
 *     void printList()
 *     {
 *         Node temp = head;
 *         while (temp != null) {
 *             System.out.print(temp.data + " ");
 *             temp = temp.next;
 *         }
 *         System.out.println();
 *     }
 *
 *     public static void main(String args[])
 *     {
 * 		Scanner sc=new Scanner(System.in);
 *         Main llist = new Main();
 *         int n=sc.nextInt();
 * 		int k=sc.nextInt();
 * 		int [] arr=new int[n];
 * 		for(int i=0;i<n;i++){
 * 				arr[i]=sc.nextInt();
 *                }
 * 		for(int i=n-1;i>=0;i--){
 * 				llist.push(arr[i]);
 *        }
 *         llist.head = llist.reverse(llist.head, k);
 *         llist.printList();
 *     }
 * }
 */
