package Graphs;
import java.util.*;
public class DFS{
      private int V;
      private LinkedList<Integer> adj[];
      @SuppressWarnings("unchecked") DFS(int v){
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
          adj[i]=new LinkedList<Integer>();
        }
      }
      void addEdge(int v,int w){
        adj[v].add(w);
      }

      void depthFirstSearch(int v,boolean [] visited){
        visited[v]=true;
        System.out.print(v+" ");

        Iterator<Integer> i=adj[v].listIterator();
        while(i.hasNext()){
          int n=i.next();
          if(!visited[n]){
            depthFirstSearch(n,visited);
          }
        }
      }
      void depth(int v){
        boolean [] visited=new boolean[V];
        depthFirstSearch(v, visited);
      }
      public static void main(String[] args) {
        DFS dfs=new DFS(4);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 0);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal "+"(starting from vertex 2)");
        dfs.depth(2);
      }
}
