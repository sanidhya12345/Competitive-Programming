class Solution {
    
private:
    bool detectCycle(int row, int col, vector<vector<int>>& vis, vector<vector<char>>& grid, int delrow[], int delcol[], int n, int m) {
        vis[row][col] = 1;
        queue<pair<pair<int, int>, pair<int, int>>> q;
        q.push({{row, col}, {-1, -1}});
        
        while (!q.empty()) {
            int r = q.front().first.first;
            int c = q.front().first.second;
            int parrow = q.front().second.first;
            int parcol = q.front().second.second;
            q.pop();
            for (int i = 0; i < 4; i++) {
                int nrow = r + delrow[i];
                int ncol = c + delcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == grid[row][col]) {
                    if (!vis[nrow][ncol]) {
                        q.push({{nrow, ncol}, {r, c}});
                        vis[nrow][ncol] = 1;
                    } else if (parrow != nrow || parcol != ncol) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

public:
    bool containsCycle(vector<vector<char>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<int>> vis(n, vector<int>(m, 0)); // Initialize 2D visited array
        int delrow[] = {0, -1, 0, 1};
        int delcol[] = {-1, 0, 1, 0};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j]) {
                    if (detectCycle(i, j, vis, grid, delrow, delcol, n, m)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
};
