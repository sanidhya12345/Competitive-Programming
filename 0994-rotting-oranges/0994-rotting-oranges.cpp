class Solution {
private:
public:
    int orangesRotting(vector<vector<int>>& grid) {
    
        int n = grid.size();
        int m = grid[0].size();

        int delrow[] = {0, -1, 0, 1};
        int delcol[] = {-1, 0, 1, 0};

        queue<pair<pair<int, int>, int>> q;
        int freshCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.push({{i, j}, 0});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        if (freshCount == 0) return 0;

        int timeElapsed = 0;

        while (!q.empty()) {
            auto curr = q.front();
            q.pop();

            int r = curr.first.first;
            int c = curr.first.second;
            int time = curr.second;

            timeElapsed = max(timeElapsed, time);

            for (int i = 0; i < 4; i++) {
                int nrow = r + delrow[i];
                int ncol = c + delcol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == 1)                   {
                    grid[nrow][ncol] = 2;
                    freshCount--;
                    q.push({{nrow, ncol}, time + 1});
                }
            }
        }

        return (freshCount > 0) ? -1 : timeElapsed;
    }
};