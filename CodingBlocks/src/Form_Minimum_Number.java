package CodingBlocks.src;

import java.util.Scanner;
import java.util.Stack;

public class Form_Minimum_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            printmin(arr[i]);
        }

    }
    public static void printmin(String str) {

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= str.length(); i++) {

            st.push(i + 1);
            if (i == str.length() || str.charAt(i) == 'I') {
                while (!st.isEmpty()) {
                    System.out.print(st.pop());
                }
            }
        }
        System.out.println();
    }
}
