from collections import deque
class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        
        def bfs(isConnected,visited,s):
            
            queue=deque()
            queue.append(s)
            visited[s]=True
            
            while queue:
                
                curr=queue.popleft()
                
                for neighbour in range(V):
                    if isConnected[curr][neighbour]==1 and not visited[neighbour]:
                        queue.append(neighbour)
                        visited[neighbour]=True
        V=len(isConnected)
        visited=[False]*V
        count=0
        for i in range(V):
            if not visited[i]:
                count+=1   
                bfs(isConnected,visited,i)
        return count