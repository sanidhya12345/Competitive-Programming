
/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

class GFG {

    public static void printBoundary(int a[][], int m,
                                     int n)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    System.out.print(a[i][j] + " ");
                else if (i == m - 1)
                    System.out.print(a[i][j] + " ");
                else if (j == 0)
                    System.out.print(a[i][j] + " ");
                else if (j == n - 1)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args)
    {
        int a[][] = { { 1, 1,2,1 }, { 2,2,1,2}};

        printBoundary(a, 2,2);
    }
}

