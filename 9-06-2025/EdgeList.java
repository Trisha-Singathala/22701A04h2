

import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        Graph g=new Graph(4);
       g.addEdge(0,1);
       g.addEdge(0,2);
       g.addEdge(0,3);
       g.addEdge(1,2);
       g.print();
    }
}
class Edge{
    int src;
    int dest;
    int weight;
    Edge(int src,int dest,int weight){
        this.src=src;
        this.dest=dest;
        this.weight=weight;
    }
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
            this.weight=1;
        
    }
}
    class Graph{
        HashSet<Edge>graph;
        int vertices;
        boolean isDirected;
        Graph(int vertices,boolean isDirected){
            this.vertices=vertices;
            this.isDirected=isDirected;
            
            graph=new HashSet<Edge>();
        }
        public void addEdge(int src,int dest){
            if(isValid(src,dest)){
                Edge e=new Edge(src,dest);
                graph.add(e);
                if(isDirected){
                    Edge e2=new Edge(dest,src);
                    graph=add(e2);
                }
            }
                else{
                    System.out.println("Invalid source and destination");
                }
                
            
        }
        public void removeEdge(int src,int dest){
            if(isValid(src,dest)){
                Edge e=new Edge(src,dest);
                graph.remove(e);
                if(isDirected){
                    Edge e2=new Edge(dest,src);
                    graph=remove(e2);
                }
            }
                else{
                    System.out.println("Invalid source and destination");
                }
                
            
        }
        public void addEdge(int src,int dest,int weight){
            if(isValid(src,dest)){
                Edge e=new Edge(src,dest,weight);
                graph.add(e);
                if(isDirected){
                    Edge e2=new Edge(dest,src);
                    graph=add(e2);
                }
            }
                else{
                    System.out.println("Invalid source and destination");
                }
                
            
        }
        public void removeEdge(int src,int dest,int weight){
            if(isValid(src,dest)){
                Edge e=new Edge(src,dest,weight);
                graph.remove(e);
                if(isDirected){
                    Edge e2=new Edge(dest,src,weight);
                    graph=remove(e2);
                }
            }
                else{
                    System.out.println("Invalid source and destination");
                }
        }
        boolean isValid(int src,int dest){
            return src>=0 && dest>=0 && src<vertices && dest<vertices && src!=dest;
        }
       void print(){
           for(int i=0;i<vertices;i++){
               System.out.println(graph.get(i));
           }
       }
        
    }
