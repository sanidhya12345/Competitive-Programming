package CodingBlocks.src;

import java.util.Scanner;
import java.util.Stack;

public class Celebrity_Problem {
    static boolean knows(int [][] MATRIX,int a, int b)
    {
        boolean res = (MATRIX[a][b] == 1) ? true : false;
        return res;
    }

    static int findCelebrity(int [][] matrix,int n)
    {
        Stack<Integer> st = new Stack<>();
        int c;
        for (int i = 0; i < n; i++)
        {
            st.push(i);
        }

        while (st.size() > 1)
        {
            int a = st.pop();
            int b = st.pop();

            if (knows(matrix,a, b))
            {
                st.push(b);
            }

            else
                st.push(a);
        }

        if(st.empty())
            return -1;

        c = st.pop();
        for (int i = 0; i < n; i++)
        {
            if (i != c && (knows(matrix,c, i) ||
                    !knows(matrix,i, c)))
                return -1;
        }
        return c;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int [][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int result = findCelebrity(matrix,n);
        if (result == -1)
        {
            System.out.println("No Celebrity");
        }
        else
            System.out.println(result);
    }
}
