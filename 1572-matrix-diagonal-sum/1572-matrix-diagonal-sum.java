class Solution {
    public int diagonalSum(int[][] mat) {
         int sum = 0;
        int left = 0;
        int right = mat[0].length - 1;
        for (int i = 0; i < mat.length; i++) {
            if (left == right) {
                sum = sum + mat[i][left];
            } else {
                sum = sum + mat[i][left] + mat[i][right];
            }
            left++;
            right--;
        }
        return sum; 
    }
}