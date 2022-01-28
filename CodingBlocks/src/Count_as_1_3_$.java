package CodingBlocks.src;

import java.util.Scanner;

public class Count_as_1_3_$ {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] c=new int[]{1,3,4};
        long[] dp=new long[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<c.length;j++){
                if(i-c[j]>=0){
                    dp[i]+=dp[i-c[j]];
                }
            }
        }
        System.out.println(dp[n]);

    }
}
