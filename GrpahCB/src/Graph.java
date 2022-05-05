import java.util.HashMap;

public class Graph {
    HashMap<Integer,HashMap<Integer,Integer>>map;
    public Graph(int v){
        map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public int noofedge(){
        int count=0;
        for(int key:map.keySet()){
            count+=map.get(key).size();
        }
        return count/2;
    }
    public boolean containsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    }
    public void removeVertex(int v){
        for(int key:map.get(v).keySet()){
            map.get(key).remove(v);
        }
        map.remove(v);
    }
    public void display(){
        for(int key:map.keySet()){
            System.out.print(key+" "+map.get(key));
        }
    }
    public void removeEdge(int v1,int v2){
        if(containsEdge(v1,v2)){
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }
    public static void main(String[] args) {
        Graph g=new Graph(7);
        g.addEdge(1,4,5);
        g.addEdge(1,2,10);
        g.addEdge(2,3,7);
        g.addEdge(3,4,6);
        g.addEdge(8,7,12);
        g.addEdge(6,7,9);
        g.addEdge(19,78,5);
        g.display();
    }
}
