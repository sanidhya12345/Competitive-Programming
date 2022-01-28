package CodingBlocks.src;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_A_Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }
        reverse(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int item = st.pop();
        reverse(st);
        insertbottom(st, item);

    }

    private static void insertbottom(Stack<Integer> st, int item) {
        if (st.isEmpty()) {
            st.push(item);
            return;
        }
        int i = st.pop();
        insertbottom(st, item);
        st.push(i);

    }
}
