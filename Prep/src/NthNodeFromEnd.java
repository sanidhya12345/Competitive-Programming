package Prep.src;
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
public class NthNodeFromEnd{
    int getNthFromLast(Node head, int n)
    {
        if(head==null){
            return -1;
        }
    	int count=0;
    	Node curr=head;
    	while(curr!=null){
    	    count++;
    	    curr=curr.next;
    	}
    	if(count<n){
    	    return -1;
    	}
    	int rem=count-n;
    	Node ptr=head;
    	for(int i=0;i<rem;i++){
    	    ptr=ptr.next;
    	}
    	return ptr.data;
    }
}