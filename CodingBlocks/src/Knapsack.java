package CodingBlocks.src;

import java.util.Arrays;
import java.util.Scanner;

public class Knapsack {
    private static int sol(int curr, int n, int[] wt, int[] price, int bagC, int[][] dp) {
        // TODO Auto-generated method stub

        if(bagC == 0 || curr == n) {
            return 0;
        }

        if(dp[bagC][curr] != -1) {
            return dp[bagC][curr];
        }
        int c1 = 0, c2 = 0;

        if(wt[curr] <= bagC) {

            c1 = price[curr] + sol(curr + 1, n, wt, price, bagC - wt[curr], dp);
        }

        c2 = sol(curr + 1, n, wt, price, bagC, dp);

        return dp[bagC][curr] = Math.max(c1, c2);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bagC=sc.nextInt();
        int [] wt=new int[n];
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        int [] price=new int[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        int[][] dp = new int[bagC + 1][n + 1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(sol(0, n, wt, price, bagC, dp));
    }
}
