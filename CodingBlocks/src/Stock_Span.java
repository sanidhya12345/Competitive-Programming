package CodingBlocks.src;

import java.util.Scanner;
import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        stockspan(arr);

    }

    private static void stockspan(int[] arr) {

        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            while (!st.empty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }

            st.push(i);

        }

        for (int i = 0; i<=ans.length; i++) {
            if(i!=ans.length){
                System.out.print(ans[i]+" ");
            }
            else{
                System.out.print("END");
            }
        }

    }
}
