class Solution {
private:
    void bfs(int src,vector<vector<int>>& isConnected,vector<int> &vis,int V){
        queue<int> q;
        vis[src]=1;
        q.push(src);
        
        while(!q.empty()){
            
            int curr=q.front();
            q.pop();
            for(int n=0;n<V;n++){
                if(isConnected[curr][n]==1 && !vis[n]){
                    q.push(n);
                    vis[n]=1;
                }
            }
        }
    }
public:
    int findCircleNum(vector<vector<int>>& isConnected) {
        int V=isConnected.size();
        vector<int> vis(V,0);
        int count=0;
        for(int i=0;i<V;i++){
            if(!vis[i]){
                count+=1;
                bfs(i,isConnected,vis,V);
            }
        }
        return count;
    }
};