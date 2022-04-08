class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] ans = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                matrix[n-1-i][n-1-j]=ans[n-1-i][j];
            }
        }
    }
}