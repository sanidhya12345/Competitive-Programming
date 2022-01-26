package CodingBlocks.src;

import java.util.Scanner;

public class Codewars_edit_distance {
    static int min(int x, int y, int z)
    {
        if (x <= y && x <= z)
            return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;
    }

    static int editDist(String str1, String str2, int m,
                        int n)
    {

        if (m == 0)
            return n;


        if (n == 0)
            return m;


        if (str1.charAt(m - 1) == str2.charAt(n - 1))
            return editDist(str1, str2, m - 1, n - 1);

        return 1
                + min(editDist(str1, str2, m, n - 1),
                editDist(str1, str2, m - 1, n),
                editDist(str1, str2, m - 1,n - 1));
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(editDist(
                str1, str2, str1.length(), str2.length()));
    }
}
