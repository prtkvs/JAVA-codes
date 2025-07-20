package Graphs;
import java.util.*;
public class CycleDirectedDFS {

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
            System.out.println("Detect Cycle DFS - Directed");
            int V = 4; //V = vertex, 3 nahi defined hai but vertex to hai
            ArrayList<Edge>[] graph = new ArrayList[V];
            createGraph(graph,V);
            System.out.println(directedCycle(graph));
        }

        public static void createGraph(ArrayList<Edge>[] graph, int V) {
            for (int i=0; i<V; i++ ) {
                graph[i] = new ArrayList<>();
            }
// 		graph[0].add(new Edge(0,3,1));
// 		graph[1].add(new Edge(1,0,1));
// 		graph[2].add(new Edge(2,0,1));
// 		graph[3].add(new Edge(3,2,1));
            graph[0].add(new Edge(0,1,1));
            graph[0].add(new Edge(0,2,1));
            graph[1].add(new Edge(1,3,1));
            graph[2].add(new Edge(2,3,1));




        }

        public static boolean directedCycle(ArrayList<Edge>[] graph){
            boolean[] vis = new boolean[graph.length];
            boolean[] Stack = new boolean[graph.length]; // explicit Stack
            for (int i=0;i<graph.length ;i++){
                if(!vis[i]){
                    if(cycleUtil(graph,i,vis,Stack)) return true;
                }
            }
            return false;
        }

        public static boolean cycleUtil(ArrayList<Edge>[] graph,int curr,boolean[] vis,boolean[] Stack){
            //dfs approach
            vis[curr] = true;
            Stack[curr] = true; //immediate true

            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);

                if(Stack[e.dest]) return true;

                if(!vis[e.dest] && cycleUtil(graph,e.dest,vis,Stack)) return true;
            }
            Stack[curr] = false;
            return false;
        }
    }
