package CodingBlocks.src;

import java.util.Scanner;
import java.util.Stack;

public class Friend_And_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            String s=sc.next();
            printmin(s);
            t-=1;
        }
    }
    public static void printmin(String str) {

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= str.length(); i++) {

            st.push(i + 1);
            if (i == str.length() || Character.getNumericValue(str.charAt(i))%2==0) {
                while (!st.isEmpty()) {
                    System.out.print(st.pop());
                }
            }
        }
        System.out.println();
    }
}
