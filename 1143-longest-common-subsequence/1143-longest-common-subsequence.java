class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char [] str1=text1.toCharArray();
        char [] str2=text2.toCharArray();
        int [][] dp=new int[str1.length+1][str2.length+1];
        if(str1.length==0 || str2.length==0){
            return 0;
        }
        for(int i=1;i<=str1.length;i++){
            for(int j=1;j<=str2.length;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                if(str1[i-1]==str2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[str1.length][str2.length];
    }
}