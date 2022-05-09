import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Graph_Practice {
    HashMap<Integer, HashMap<Integer,Integer>>map;
    public Graph_Practice(int v){
        map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean hasPath(int source, int destination, HashSet<Integer> visited){
        if (source==destination) return true;
        visited.add(source);
        for(int key:map.get(source).keySet()){
            if(!visited.contains(key)){
                boolean ispath=hasPath(key,destination,visited);
                if(ispath) return true;
            }
        }
        visited.remove(source);
        return false;
    }
    public void PrintAllPath(int source,int destination,HashSet<Integer> visited,String s){
        if(source==destination) {
            System.out.println(s+destination);
            visited.remove(source);
            return;
        }
        visited.add(source);
        for(int key:map.get(source).keySet()){
            if(!visited.contains(key)){
                PrintAllPath(key,destination,visited,s+source);
            }
        }
        visited.remove(source);
    }
    public boolean BFS(int source,int destination){
        LinkedList<Integer> queue=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        queue.add(source);
        while (!queue.isEmpty()){
            int rv=queue.remove();
            if(visited.contains(rv)){
                continue;
            }
            visited.add(rv);
            if (rv==destination){
                return true;
            }
            for (int key:map.get(rv).keySet()){
                if(!visited.contains(key)){
                    queue.add(key);
                }
            }
        }
        return false;
    }
    public boolean DFS(int source,int destination){
        Stack<Integer> stack=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        stack.push(source);
        while(!stack.isEmpty()){
            int rv=stack.pop();
            if(visited.contains(rv)){
                continue;
            }
            visited.add(rv);
            if (rv==destination){
                return true;
            }

            for (int key:map.get(source).keySet()){
                if (!visited.contains(key)){
                    stack.push(key);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Graph_Practice graph=new Graph_Practice(7);
        graph.addEdge(1, 4, 5);
        graph.addEdge(1, 2, 10);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 4);
        graph.addEdge(5, 6, 3);
        graph.addEdge(5, 7, 2);
        graph.addEdge(6, 7, 7);
        graph.PrintAllPath(1,6,new HashSet<>(),"");
        System.out.println(graph.BFS(1,5));
        System.out.println(graph.DFS(1,6));
    }
}
