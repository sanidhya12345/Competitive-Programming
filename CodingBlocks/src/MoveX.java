package CodingBlocks.src;

import java.util.Scanner;

public class MoveX {
    static void moveAtEnd(String s, int i, int l)
    {
        if (i >= l)
            return;


        char curr = s.charAt(i);


        if (curr != 'x')
            System.out.print(curr);
        moveAtEnd(s, i + 1, l);
        if (curr == 'x')
            System.out.print(curr);

        return;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        moveAtEnd(s, 0, l);
    }
}
