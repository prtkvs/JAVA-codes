package Graphs;
import java.util.*;
public class PrimsAlgoMST {
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

        static class Pair implements Comparable<Pair>{
            int n; //node
            int cost;

            public Pair(int n,int cost){
                this.n = n;
                this.cost = cost;
            }

            @Override
            public int compareTo(Pair p2){
                return this.cost-p2.cost; //path based sorting
            }
        }


        public static void main(String[] args) {
            System.out.println("Prim's Algorithm - MST");
            int V = 5; //V = vertex
            ArrayList<Edge>[] graph = new ArrayList[V];
            createGraph(graph,V);
            prims(graph);
        }

        public static void createGraph(ArrayList<Edge>[] graph, int V) {
            for (int i=0; i<V; i++ ) {
                graph[i] = new ArrayList<>();
            }
            graph[0].add(new Edge(0,1,10));
            graph[0].add(new Edge(0,2,15));
            graph[0].add(new Edge(0,3,30));
            graph[1].add(new Edge(1,3,40));
            graph[1].add(new Edge(1,0,10));
            graph[3].add(new Edge(3,1,40));
            graph[2].add(new Edge(2,3,50));
            graph[2].add(new Edge(2,0,15));
            graph[3].add(new Edge(3,0,30));
            graph[3].add(new Edge(3,2,50));
        }

        public static void prims(ArrayList<Edge>[] graph){
            boolean[] vis = new boolean[graph.length];
            PriorityQueue<Pair> pq = new PriorityQueue<>();

            pq.add(new Pair(0,0));
            int finalCost = 0;
            while(!pq.isEmpty()){
                Pair curr = pq.poll();

                if(!vis[curr.n]){
                    vis[curr.n]= true;
                    finalCost+=curr.cost;
                    for (int i=0;i<graph[curr.n].size() ;i++ ){
                        Edge e = graph[curr.n].get(i);
                        pq.add(new Pair(e.dest,e.wt));
                    }
                }
            }
            System.out.println(finalCost);
        }
}
