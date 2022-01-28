package CodingBlocks.src;

import java.util.Scanner;

public class Tiling_Problem_I {
    public static long tp1(int n,long[] dp){
        if(n<=2)return n;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }


    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] dp=new long[n+1];
        long ans=tp1(n,dp);
        System.out.println(ans);
    }
}
