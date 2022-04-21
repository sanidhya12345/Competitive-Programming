/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

public class LinkedList {
    Node head;
    int size = 0;
    Node tail;

    public void insertfirst(int element){

        Node node = new Node(element);
        node.next= head;
        head = node;

        if(tail==null){
            tail=head;
        }

        size++;
    }

    public void insertlast(int element){

        if(size==0){
            insertfirst(element);
            return;
        }

        Node node = new Node(element);

        tail.next = node;

        tail = node;

        size++;
    }

    public int deletefirst(){

        if(size == 0){
            System.out.println("Khaali he yaar ");
            return -1;
        }

        int temp = head.value;

        head = head.next;

        if(head == null ){
            tail =null;
        }
        size--;

        return temp;

    }

    public int deletelast(){

        if(size<2){
            return deletefirst();
        }

        Node temp = head;

        while(temp.next!=tail){

            temp = temp.next;
        }

        int del = temp.next.value;

        temp.next =null;

        tail = temp;

        size--;

        return del;
    }

    public Node get(int index){

        Node temp = head;

        for (int i = 0; i <index ; i++) {

            temp = temp.next;
        }

        return temp;
    }

    public void insertmid(int index, int element){

        if(index==0){
            insertfirst(element);
            return;
        }

        if(index ==size){
            insertlast(element);
            return;
        }

        Node prev = get(index - 1);

        Node node = new Node(element);

        node.next = prev.next;

        prev.next = node;

        size++;
    }

    public int deleteindex(int index)
    {

        if(index==0)
        {
            return deletefirst();
        }
        if(index==size-1)
        {
            return deletelast();
        }


        Node prev = get(index-1);
        int temp= prev.next.value;
        prev.next= prev.next.next;

        size--;
        return temp;
    }
    public void display(){

        Node temp = head;

        while(temp!=null){

            System.out.print(temp.value +" ");
            temp=temp.next;
        }
    }
    public Node intersection(LinkedList h1, LinkedList h2) {

        Node fp = h1.head;
        Node sp = h2.head;

        while (fp != sp) {

            if (fp == null)
                fp = h2.head;
            else
                fp = fp.next;

            if (sp == null)
                sp = h1.head;
            else
                sp = sp.next;

        }

        return fp;

    }
    public class Node{

        int value ;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LinkedList list1=new LinkedList();
        list1.insertlast(10);
        list1.insertlast(20);
        list1.insertlast(30);
        list1.insertlast(40);
        list1.insertlast(50);
        LinkedList list2=new LinkedList();
        list2.insertlast(15);
        list2.insertlast(25);
        list2.insertlast(40);
        list2.insertlast(50);
        LinkedList list=new LinkedList();
        Node ans=list.intersection(list1,list2);
        System.out.println(ans);
    }
}
