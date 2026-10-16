import java.util.*;
public class Graph{
    public static void main(String[]args){
    
    ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
    int n=5;
    for(int i=0;i<n;i++){
        graph.add(new ArrayList<>());
    }
    addEdge(graph,0,2);
    addEdge(graph,0,1);
    addEdge(graph,1,3);
    addEdge(graph,2,4);
    for(int i=0;i<n;i++){
        System.out.println(i+"->"+graph.get(i));
    }
}
static void addEdge(ArrayList<ArrayList<Integer>>graph,int u ,int v){
    graph.get(u).add(v);
    graph.get(v).add(u);
}
}

