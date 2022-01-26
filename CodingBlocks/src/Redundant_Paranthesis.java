package CodingBlocks.src;
import java.util.Scanner;
import java.util.Stack;

public class Redundant_Paranthesis {
    static boolean findDuplicateparenthesis(String s) {

        Stack<Character> Stack = new Stack<>();


        char[] str = s.toCharArray();
        for (char ch : str) {

            if (ch == ')') {

                char top = Stack.peek();
                Stack.pop();


                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if (elementsInside < 1) {
                    return true;
                }
            }
            else {
                Stack.push(ch);
            }
        }


        return false;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test!=0){
            String str =sc.next();

            if (findDuplicateparenthesis(str)) {
                System.out.println("Duplicate");
            } else {
                System.out.println("Not Duplicates");
            }
            test-=1;
        }


    }
}
