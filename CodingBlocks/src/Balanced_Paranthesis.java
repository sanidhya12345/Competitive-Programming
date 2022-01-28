package CodingBlocks.src;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Paranthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        if(ValidString(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    public static boolean ValidString(String s) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cch = s.charAt(i);

            if (cch == '(' || cch == '{' || cch == '[') {
                st.push(cch);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char topch = st.pop();
                    if (cch == '}' && topch == '{') {
                        continue;
                    }

                    else if (cch == ')' && topch == '(') {
                        continue;
                    } else if (cch == ']' && topch == '[') {
                        continue;
                    }

                    else {
                        return false;
                    }

                }
            }

        }
        return st.isEmpty();

    }
}
