package CodingBlocks.src;

import java.util.Scanner;

public class Minimum_Cost_climbing {
    static int minimumCost(int cost[],
                           int n)
    {

        int dp[] = new int[n];


        if (n == 1)
            return cost[0];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++)
        {
            dp[i] = Math.min(dp[i - 1],
                    dp[i - 2]) + cost[i];
        }
        return Math.min(dp[n - 2],
                dp[n - 1]);
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print(minimumCost(a, n));
    }
}
