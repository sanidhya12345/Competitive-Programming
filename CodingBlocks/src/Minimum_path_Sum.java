package CodingBlocks.src;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_path_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] dp = new int[arr.length][arr[0].length];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(PathSum(arr, 0, 0, dp));

    }

    public static int PathSum(int[][] grid, int cc, int cr, int[][] dp) {
        if (cc >= grid[0].length || cr >= grid.length) {
            return Integer.MAX_VALUE;
        }
        if (cc == grid[0].length - 1 && cr == grid.length - 1) {
            return grid[cr][cc];
        }
        if (dp[cr][cc] != -1) {
            return dp[cr][cc];
        }

        int down = PathSum(grid, cc, cr + 1, dp);
        int right = PathSum(grid, cc + 1, cr, dp);
        return dp[cr][cc] = (Math.min(down, right) + grid[cr][cc]);

    }
}
