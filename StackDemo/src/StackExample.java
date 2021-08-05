import java.util.Scanner;

public class StackExample {
    int[] ar;
    int top;
    StackExample()
    {
        ar=new int[5];
        top=-1;
    }
    void push()
    {
        if(top==4)
        {
            System.out.println("Stack is full");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc2=new Scanner(System.in);
            int data= sc2.nextInt();
            ar[++top]=data;
            System.out.println("data inserted...");
        }
    }
    void pop()
    {
        if (top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("deleted element : "+ar[top]);
            top=top-1;
        }
    }
    void traverse()
    {
        if (top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for (int i = top; i >=0 ; i--) {
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
    }
    void peek(){
        if(top<0){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("peek"+ar[top]);
        }
    }
    public static void main(String[] args)
    {
        StackExample obj=new StackExample();
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
