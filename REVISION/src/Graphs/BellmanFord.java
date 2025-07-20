package Graphs;
import java.util.*;
public class BellmanFord {
    static class Edge {
            int src;
            int dest;
            int wt;
            public Edge(int src,int dest, int wt) {
                this.src = src;
                this.dest = dest;
                this.wt = wt;
            }
        }

        public static void main(String[] args) {
            System.out.println("Bellman Ford Algorithm");
            int V = 5; //V = vertex
            ArrayList<Edge>[] graph = new ArrayList[V];
            createGraph(graph,V);
            bellmanFord(graph,0);

        }

        public static void createGraph(ArrayList<Edge>[] graph, int V) {
            for (int i=0; i<V; i++ ) {
                graph[i] = new ArrayList<>();
            }
            graph[0].add(new Edge(0,1,2));
            graph[0].add(new Edge(0,2,4));
            graph[1].add(new Edge(1,2,-4));
            graph[2].add(new Edge(2,3,2));
            graph[3].add(new Edge(3,4,4));
            graph[4].add(new Edge(4,1,-1));
        }

        public static void bellmanFord(ArrayList<Edge>[] graph, int src){
            int V = graph.length;
            int[] dist = new int[V];

            for(int i=0;i<V;i++){
                if(i!=src){
                    dist[i] = Integer.MAX_VALUE;
                }
            }
            // dist[src] = 0; by default no need to mention

            for(int i=0;i<V-1;i++){ //iterations performed

                for(int j=0;j<V;j++){ //for 1 iteration

                    for (int k=0;k<graph[j].size() ;k++ ){
                        Edge e = graph[j].get(k);

                        int u = e.src;
                        int v = e.dest;
                        int w = e.wt;

                        //Condition
                        if(dist[u]!=Integer.MAX_VALUE){
                            if(dist[u]+w<dist[v]){
                                dist[v] = dist[u]+w;
                            }
                        }
                    }
                }
            }
            for(int i=0;i<dist.length;i++){
                System.out.println(i+"->"+dist[i]);
            }
        }
}
