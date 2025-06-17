
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
     Graph g=new Graph(4);
     g.addEdge(0,1);
     g.addEdge(0,2);
     g.addEdge(0,3);
     g.addEdge(1,2);
     g.print();
    }
}
class Graph{
    ArrayList<ArrayList<Integer>>graph;
    int vertices;
    Graph(int vertices){
        this.vertices=vertices;
        this.graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }else{
            System.err.println("Invalid source and destination");
        }
    }
    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).remove(dest);
            graph.get(dest).remove(src);
        }else{
            System.err.println("Invalid source and destination");
        }
    }
    public ArrayList<Integer> neighbours(int node){
        return graph.get(node);
    }
    boolean isHaving(int src,int dest){
        if(isValid(src,dest)){
            var arr=graph.get(src);
            for(int i=0; i<arr.size();i++){
                if(arr.get(i)==dest){
                    return true;
                }
            }
            return false;
        }
        System.out.println("Inavlaid source and destination");
        return false;
    }
    boolean isValid(int src,int dest){
        return src>=0&&dest>=0&&src<=vertices&&dest<=vertices&&src!=dest;
    }
    void print(){
        for(int i=0;i<vertices;i++){
            System.out.println(i+" : "+graph.get(i));
        }
    }
}