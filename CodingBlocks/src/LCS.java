package CodingBlocks.src;

import java.util.Arrays;
import java.util.Scanner;

public class LCS {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int[][] dp = new int[s1.length()][s2.length()];
        for(int [] a: dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(lcs(s1, s2, 0, 0,dp));

    }

    public static int lcs(String s1, String s2, int i, int j,int [][]dp) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }

        if(dp[i][j]!=-1) {
            return dp[i][j];
        }

        int ans = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            ans = 1 + lcs(s1, s2, i + 1, j + 1,dp);
        } else {
            int fs1 = lcs(s1, s2, i + 1, j,dp);
            int ss1 = lcs(s1, s2, i, j + 1,dp);
            ans = Math.max(fs1, ss1);

        }
        return dp[i][j] = ans;

    }
}
