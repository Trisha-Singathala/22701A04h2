

class Main {
    public static void main(String[] args) {
        Graph g=new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.print();
        
        g.removeEdge(0,1);
        System.out.println("after removing the edge 0 and 1 is: ");
        g.print();
    }
}
class Graph{
    int[][] graph;
    int vertices;
    Graph(int vertices){
        this.graph=new int[vertices][vertices];
        this.vertices=vertices;
    }
    void addEdge(int src,int dest){
        if(isValid(src,dest)){
        graph[src][dest]=1;
        graph[dest][src]=1;
    }
    else{
        System.out.println("Invalid source and destination");
    }
    }
    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
        graph[src][dest]=0;
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
}