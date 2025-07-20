package Graphs;
import java.util.*;
public class CycleDFS {
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
            System.out.println("Detect Cycle DFS");
            int V = 7; //V = vertex
            ArrayList<Edge>[] graph = new ArrayList[V];
            createGraph(graph,V);
            System.out.println(detectCycleDFS(graph));
        }

        public static void createGraph(ArrayList<Edge>[] graph, int V) {
            for (int i=0; i<V; i++ ) {
                graph[i] = new ArrayList<>();
            }
            graph[0].add(new Edge(0,1,1));
            graph[0].add(new Edge(0,3,1));
            graph[0].add(new Edge(0,2,1));
            graph[1].add(new Edge(1,0,1));
            graph[1].add(new Edge(1,2,1));
            graph[2].add(new Edge(2,4,1));
            graph[2].add(new Edge(2,1,1));
            graph[0].add(new Edge(2,0,1));
            graph[3].add(new Edge(3,0,1));
            graph[4].add(new Edge(4,2,1));

        }

        public static boolean detectCycleDFS(ArrayList<Edge>[] graph){
            boolean[] vis = new boolean[graph.length];
            for(int i=0;i<graph.length;i++){
                if(!vis[i]){
                    if(detectCycleDFSutil(graph,vis,i,-1)) return true;
                    return false;
                }
            }
            return false;
        }

        public static boolean detectCycleDFSutil(ArrayList<Edge>[] graph,boolean[]vis,int curr,int parent){
            vis[curr] = true;
            for (int i=0;i<graph[curr].size() ;i++ ){
                Edge e = graph[curr].get(i);
                //case 1 : vis but not parent
                if (vis[e.dest] && e.dest!=parent){
                    return true;
                }
                //case 3 : not visited and proceed
                if(!vis[e.dest] && detectCycleDFSutil(graph,vis,e.dest,curr)){
                    return true;
                }
                //case 2 : continue
            }
            return false;
        }
    }

