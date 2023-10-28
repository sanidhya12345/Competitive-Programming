package Prep.src;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    private static int evalRPN(String [] tokens){
        int ans=0;
        String operators="+-*/";
        Stack<String> stack=new Stack<>();
        for(String t:tokens){
            if(!operators.contains(t)){
                stack.push(t);
            }
            else{
                int a=Integer.valueOf(stack.pop());
                int b=Integer.valueOf(stack.pop());
                int index=operators.indexOf(t);
                switch (index){
                    case 0:
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b-a));
                        break;
                    case 2:
                        stack.push(String.valueOf(b*a));
                        break;
                    case 3:
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
        ans=Integer.valueOf(stack.pop());
        return ans;
    }
    public static void main(String[] args) {
        String [] tokens={"2","1","+","3","*"};
        int ans=evalRPN(tokens);
        System.out.println(ans);
    }
}
