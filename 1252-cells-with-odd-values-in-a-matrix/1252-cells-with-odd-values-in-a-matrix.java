class Solution {
    public int oddCells(int m, int n, int[][] indexes) {
        int [][] matrix=new int[m][n];
         for(int i=0;i< indexes.length;i++){
            int row=indexes[i][0];
            int col=indexes[i][1];
            for(int j=0;j<n;j++){
                matrix[row][j]++;
            }
            for(int k=0;k<m;k++){
                matrix[k][col]++;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]%2!=0) count++;
            }
        }
        return count;
    }
}