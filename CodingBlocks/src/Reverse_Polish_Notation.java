package CodingBlocks.src;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_Polish_Notation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(String ch : tokens){
            if(ch.equals("+")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num1+num2);
            }else if(ch.equals("-")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2-num1);
            }else if(ch.equals("*")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num1*num2);
            }else if(ch.equals("/")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2/num1);
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            String str=sc.next();
            int index=0;
            String[] s=new String[str.length()];
            for(char i:str.toCharArray()){
                s[index++]=Character.toString(i);
            }
            int result = evalRPN(s);
            System.out.println(result);
            t-=1;
        }
    }

}
