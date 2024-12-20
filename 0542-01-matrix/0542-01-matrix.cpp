class Solution {
public:
    vector<vector<int>> updateMatrix(vector<vector<int>>& mat) {
        int n=mat.size();
        int m=mat[0].size();
        
        //created a visited and distance matrix
        vector<vector<int>> vis(n,vector<int>(m,0));
        vector<vector<int>> dist(n,vector<int>(m,0));
        
        //we will create a queue which holds the pair<coordinates,steps>
        
        queue<pair<pair<int,int>,int>> q;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //starts the bfs if cell contains 1
                if(mat[i][j]==0){
                    q.push({{i,j},0});
                    vis[i][j]=1;
                }
                else{
                   vis[i][j]=0;   
                }
            }
        }
        
        //now for each cells there are 4 neighbours(up,down,left,right)
        
        
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        
        //traversing the queue becomes empty
        
        while(!q.empty()){
            
            
            int row=q.front().first.first;
            int col=q.front().first.second;
            int steps=q.front().second;
            q.pop();
            dist[row][col]=steps;
            //traversing the 4 neighbours
            
            for(int i=0;i<4;i++){
                
                int nrow = row + delrow[i]; 
	            int ncol = col + delcol[i];
                
                //now check the valid unvisited cell
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0){
                     vis[nrow][ncol]=1;
                     q.push({{nrow,ncol},steps+1});
                }    
            }
        }
        return dist;
    }
};