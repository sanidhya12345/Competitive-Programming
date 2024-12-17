from collections import deque
class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        
        def bfs(row,col,visited,grid,n,m,delrow,delcol):
            
            queue=deque()
            queue.append((row,col))
            visited[row][col]=True
            
            while queue:
                curr=queue.popleft()
                
                r=curr[0]
                c=curr[1]
                
                for i in range(4):
                    nrow=r+delrow[i]
                    ncol=c+delcol[i]
                    if nrow>=0 and nrow<n and ncol>=0 and ncol<m and grid[nrow][ncol]=='1' and not visited[nrow][ncol]:
                        queue.append((nrow,ncol))
                        visited[nrow][ncol]=True       
        n=len(grid)
        m=len(grid[0])
        count=0
        delrow=[0,-1,0,1]
        delcol=[-1,0,1,0]
        visited=[[False for _ in range(m)] for _ in range(n)]
        for row in range(n):
            for col in range(m):
                if not visited[row][col] and grid[row][col]=='1':
                    count+=1
                    bfs(row,col,visited,grid,n,m,delrow,delcol)
        return count