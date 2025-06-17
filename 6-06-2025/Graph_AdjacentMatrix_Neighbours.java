
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Graph g=new Graph(4,false);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,2);
       
        System.out.println("----- undirected graph ----");
        g.print();
         System.out.println(" neighbours for 0 :"+g.neighbour(0));
          System.out.println("neighbours for 1 :"+g.neighbour(1));
           System.out.println("neighbours for 2 :"+g.neighbour(2));
       System.out.println("neighbours for 3 :"+g.neighbour(3));
    }
}
class Graph{
    int[][] graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices,boolean isDirected){
        this.graph=new int[vertices][vertices];
        this.vertices=vertices;
        this.isDirected=isDirected;
    }
    void addEdge(int src,int dest){
        if(isValid(src,dest)){
        graph[src][dest]=1;
        if(!isDirected)
        graph[dest][src]=1;
    }
    else{
        System.out.println("Invalid source and destination");
    }
    }
    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
        graph[src][dest]=0;
        if(!isDirected)
        graph[dest][src]=0;
    }
    else{
        System.out.println("Invalid source and destination");
    }
    }
    boolean havingEdge(int src,int dest){
        if(isValid(src,dest)){
            if(graph[src][dest]==1){
                return true;
            }
            else return false;
        }
        System.out.println("Inavalid source and destination");
        return false;
    }
    boolean isValid(int src,int dest){
        return src>=0 && dest>=0 && src<vertices && dest<vertices &&src!=dest;
    }
    void print(){
        System.out.println("The elements in the graph are:");
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    public ArrayList<Integer> neighbour(int node){
        ArrayList<Integer>n=new ArrayList<Integer>();
        for(int i=0;i<vertices;i++){
            if(graph[node][i]==1){
                n.add(i);
            }
        }
        return n;
    }
}