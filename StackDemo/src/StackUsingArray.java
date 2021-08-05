public class StackUsingArray {
    int [] ar;
    int top;
    StackUsingArray(){
        ar=new int[5];
        top=-1;
    }
    public  void push(int data){
        if (top==4)
            System.out.println("Stack is full");
        else
            ar[++top]=data;
        System.out.println("data inserted successfully......");
    }
    public void traverse(){
        if (top==-1){
            System.out.println("stack is empty");
        }
        else{
            for (int i = top; i>=0; i--) {
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StackUsingArray obj=new StackUsingArray();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.traverse();
    }
}
