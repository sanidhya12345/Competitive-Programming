/*
 * Copyright (c) 3-3/7/22, 6:56 PM by Sanidhya Varshney
 */

import java.util.ArrayList;

public class SpiralTraversal {
    static ArrayList<Integer> matrixele=new ArrayList<>();
    private static void spiral(int [][]a,int m,int n){
        int i, k = 0, l = 0;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                matrixele.add(a[k][i]);
            }
            k++;
            for (i = k; i < m; ++i) {
                matrixele.add(a[i][n-1]);
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    matrixele.add(a[m - 1][i]);
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    matrixele.add(a[i][l]);
                }
                l++;
            }
        }
    }
    public static void main(String[] args) {
        int [][] matrix={{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15,16}};
        spiral(matrix,4,4);
        System.out.println(matrixele);
    }
}
