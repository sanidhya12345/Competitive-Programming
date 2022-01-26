package CodingBlocks.src;

import java.util.Arrays;
import java.util.Scanner;

public class Paul_And_Railtrack {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a1=new int[n];
        int[] a2=new int[m];
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }
        int[][] dp=new int[n][m];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        int ans=track(a1,a2,0,0,dp);
        System.out.println(ans);
        sc.close();
    }

    private static int track(int[] a1,int[] a2,int i,int j,int[][] dp){
        if(i>=a1.length||j>=a2.length)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=0;
        if(a1[i]==a2[j]){
            ans=1+track(a1,a2,i+1,j+1,dp);
        }
        else{
            int v1=track(a1,a2,i+1,j,dp);
            int v2=track(a1,a2,i,j+1,dp);
            ans=Math.max(v1,v2);

        }
        return dp[i][j]=ans;
    }
}
