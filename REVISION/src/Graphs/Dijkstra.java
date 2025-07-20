package Graphs;
import java.util.*;
public class Dijkstra {
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
            int path;

            public Pair(int n,int path){
                this.n = n;
                this.path = path;
            }

            @Override
            public int compareTo(Pair p2){
                return this.path-p2.path; //path based sorting
            }
        }

        public static void main(String[] args) {
            System.out.println("Dijkstra Algorithm");
            int V = 6; //V = vertex
            ArrayList<Edge>[] graph = new ArrayList[V];
            createGraph(graph,V);
            dijkstra(graph,0);

        }

        public static void createGraph(ArrayList<Edge>[] graph, int V) {
            for (int i=0; i<V; i++ ) {
                graph[i] = new ArrayList<>();
            }
            graph[0].add(new Edge(0,1,2));
            graph[0].add(new Edge(0,2,4));
            graph[1].add(new Edge(1,3,7));
            graph[1].add(new Edge(1,2,1));
            graph[2].add(new Edge(2,4,3));
            graph[4].add(new Edge(4,3,2));
            graph[4].add(new Edge(4,5,5));
            graph[3].add(new Edge(3,5,1));
        }

        public static void dijkstra(ArrayList<Edge>[] graph, int src){
            int[] dist = new int[graph.length];
            PriorityQueue<Pair> pq = new PriorityQueue<>();
            boolean[] vis = new boolean[graph.length];

            for (int i=0;i<graph.length ;i++ ){
                if(i!=src){
                    dist[i] = Integer.MAX_VALUE; //Infinity initialised
                }
            }

            pq.add(new Pair(src,0));
            while(!pq.isEmpty()){
                Pair curr = pq.poll();
                //when visit
                if(!vis[curr.n]){
                    vis[curr.n] = true;

                    for (int i=0;i<graph[curr.n].size() ;i++ ){
                        Edge e = graph[curr.n].get(i);

                        int u = e.src;
                        int v = e.dest;
                        int w = e.wt;

                        //Dijkstra Condition
                        if(dist[u]+w<dist[v]){
                            dist[v]= dist[u]+w;
                            pq.add(new Pair(v,dist[v]));
                        }
                    }
                }
            }
            for (int i=0;i<dist.length ;i++ ){
                System.out.println(i+" -> "+dist[i]);
            }
        }
    }
