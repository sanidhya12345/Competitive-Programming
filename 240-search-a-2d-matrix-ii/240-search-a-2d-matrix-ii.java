class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
	while (row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length) 
		if (matrix[row][col] == target) return true;
		else if (matrix[row][col] < target) row++;
		else col--;
	return false;
        
    }
}