class Solution {
public:
    int numEnclaves(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        
        // Directions for moving in the grid
        int delrow[] = {0, -1, 0, 1};
        int delcol[] = {-1, 0, 1, 0};
        
        vector<vector<int>> vis(n, vector<int>(m, 0));
        queue<pair<int, int>> q;
        
        // Traverse boundary rows and columns and mark reachable land cells
        for (int j = 0; j < m; j++) {
            if (grid[0][j] == 1 && !vis[0][j]) {
                q.push({0, j});
                vis[0][j] = 1;
            }
            if (grid[n - 1][j] == 1 && !vis[n - 1][j]) {
                q.push({n - 1, j});
                vis[n - 1][j] = 1;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1 && !vis[i][0]) {
                q.push({i, 0});
                vis[i][0] = 1;
            }
            if (grid[i][m - 1] == 1 && !vis[i][m - 1]) {
                q.push({i, m - 1});
                vis[i][m - 1] = 1;
            }
        }
        
        // BFS to mark all land cells reachable from the boundary
        while (!q.empty()) {
            int row = q.front().first;
            int col = q.front().second;
            q.pop();
            
            for (int i = 0; i < 4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m 
                    && grid[nrow][ncol] == 1 && !vis[nrow][ncol]) {
                    q.push({nrow, ncol});
                    vis[nrow][ncol] = 1;
                }
            }
        }
        
        // Count land cells that are not visited (enclaves)
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    count++;
                }
            }
        }
        
        return count;
    }
};