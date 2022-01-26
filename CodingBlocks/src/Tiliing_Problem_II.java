package CodingBlocks.src;

import java.util.Scanner;

public class Tiliing_Problem_II {
    static int mod = (int) (1e9 + 7);
    public static long TillProblemBU(int n, int m) {

        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1]%mod;
            if (i - m >= 0) {
                dp[i] = (dp[i] + dp[i - m]%mod)%mod;
            }
        }
        return dp[n]%mod;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(TillProblemBU(n, m));

        }
    }
}
