package Graphs;

import java.util.*;

public class BFS{
      private int V;
      private LinkedList<Integer> adj[];

      @SuppressWarnings("unchecked") BFS(int v){
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
          adj[i]=new LinkedList<Integer>();
        }
      }
      void addEdge(int v,int w){
        adj[v].add(w);
      }
    void breadthFirstSearch(int s){
      boolean [] visited=new boolean[V];
      LinkedList<Integer> queue=new LinkedList<>();
      visited[s]=true;
      queue.add(s);

      while(queue.size()!=0){
        s=queue.poll();
        System.out.print(s+" ");

        Iterator<Integer> i=adj[s].listIterator();
        while(i.hasNext()){
          int n=i.next();
          if(!visited[n]){
            visited[n]=true;
            queue.add(n);
          }
        }
      }
    }
  public static void main(String[] args) {
    BFS bfs=new BFS(4);
    bfs.addEdge(0, 1);
    bfs.addEdge(0, 2);
    bfs.addEdge(1, 2);
    bfs.addEdge(2, 0);
    bfs.addEdge(2, 3);
    bfs.addEdge(3, 3);
    System.out.println("Following is Breadth First Traversal "+"(starting from vertex 2)");
    bfs.breadthFirstSearch(2);
  }
}
