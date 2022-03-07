class Solution {
    final int[][] dirs = {{1,0},{0,1},{-1, 0}, {0,-1}};
    public int numIslands(char[][] grid) {
        int ans = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    ans++;
                }
            }
        }
        return ans;
    }
    
    private void dfs(int row, int col, char[][] grid) {
        grid[row][col] = '0';
        
        for (int[] dir: dirs) {
            int x = row + dir[0];
            int y = col + dir[1];
            if (isValid(x, y, grid)) {
                dfs(x, y, grid);
            }
        }
    }
    private boolean isValid(int row, int col, char[][] grid) {
        if (row >= grid.length || row < 0 || col >= grid[0].length || col < 0 || grid[row][col] == '0') {
            return false;
        }
        return true;
    }
}