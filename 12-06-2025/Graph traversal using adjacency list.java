
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;


class Main {
    public static void main(String[] args) {
     Graph g=new Graph(5,false);
     g.addEdge(0,1);
     g.addEdge(0,4);
     g.addEdge(1,2);
     g.addEdge(1,4);
     g.addEdge(1,3);
     g.addEdge(3,4);
     g.addEdge(2,3);
     g.print();
      System.out.println("The dfs is:");
     g.dfs(0,new boolean[5]);
     System.out.println();
       System.out.print("The bfs is:");
     g.bfs();
    }
}
class Graph{
    ArrayList<HashSet<Integer>>graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices,boolean isDirected){
        this.vertices=vertices;
        this.isDirected=isDirected;
        this.graph=new ArrayList<HashSet<Integer>>();
        for(int i=0;i<vertices;i++){
            graph.add(new HashSet<>());
        }
    }
    void addEdge(int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).add(dest);
            if(!isDirected)
            graph.get(dest).add(src);
        }else{
            System.err.println("Invalid source and destination.\n Available vertices are:");
            for(int i=0;i<vertices;i++){
                System.out.println(i+" ");
            }
        }
    }
    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).remove(dest);
               if(!isDirected)
            graph.get(dest).remove(src);
        }else{
            System.err.println("Invalid source and destination.\n The available vertices are:");
            for(int i=0;i<vertices;i++){
                System.out.println(i+" ");
            }
        }
    }
    public HashSet<Integer> neighbours(int node){
        return graph.get(node);
    }
    boolean isHavingEdge(int src,int dest){
        return this.graph.get(src).contains(dest);
    }
    HashSet<Integer>getNeighbours(int src) 
    throws IndexOutOfBoundsException{
        if(src>=0 && src<vertices) return this.graph.get(src);
        throw new IndexOutOfBoundsException("Invalid source and destination");
    }
    boolean isValid(int src,int dest){
        return src>=0&&dest>=0&&src<=vertices&&dest<=vertices&&src!=dest;
    }
    void print(){
        for(int i=0;i<vertices;i++){
            System.out.println(i+" : "+graph.get(i));
        }
    }
    void dfs(int start,boolean[] visited){
        visited[start]=true;
        System.out.println();
        System.out.print(start+" ");
        var neibhours=getNeighbours(start);
        for(int neibhour : neibhours){
            if(!visited[neibhour]){
                dfs(neibhour,visited);
            }
        }
    }
    void bfs(){
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean[] visited=new boolean[vertices];
        while(!q.isEmpty()){
            int current=q.remove();
            if(!visited[current]){
                visited[current]=true;
              
                System.out.print(current+" ");
                var neibhours=getNeighbours(current);
                for(Integer neibhour:neibhours){
                    q.add(neibhour);
                }
            }
        }
    }
}