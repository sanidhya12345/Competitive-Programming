package CodingBlocks.src;

import java.util.Arrays;
import java.util.Scanner;

public class Goldmine_Problem {

    static int getMaxGold(int[][] gold,
                          int m, int n)
    {


        int[][] goldTable = new int[m][n];

        for(int[] rows:goldTable)
            Arrays.fill(rows, 0);

        for (int col = n-1; col >= 0; col--)
        {
            for (int row = 0; row < m; row++)
            {


                int right = (col == n-1) ? 0
                        : goldTable[row][col+1];


                int right_up = (row == 0 ||
                        col == n-1) ? 0 :
                        goldTable[row-1][col+1];


                int right_down = (row == m-1
                        || col == n-1) ? 0 :
                        goldTable[row+1][col+1];


                goldTable[row][col] = gold[row][col]
                        + Math.max(right, Math.max(right_up,
                        right_down));

            }
        }


        int res = goldTable[0][0];

        for (int i = 1; i < m; i++)
            res = Math.max(res, goldTable[i][0]);

        return res;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println(getMaxGold(arr, n, m));
        }

    }
}
