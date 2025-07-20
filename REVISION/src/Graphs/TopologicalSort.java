package Graphs;

import java.util.*;
public class TopologicalSort {
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
            System.out.println("Topological Sort - DAG");
            int V = 6; //V = vertex
            ArrayList<Edge>[] graph = new ArrayList[V];
            createGraph(graph,V);
            topSort(graph);
        }

        public static void createGraph(ArrayList<Edge>[] graph, int V) {
            for (int i=0; i<V; i++ ) {
                graph[i] = new ArrayList<>();
            }
            graph[5].add(new Edge(5,0,1));
            graph[5].add(new Edge(5,2,1));
            graph[4].add(new Edge(4,0,1));
            graph[4].add(new Edge(4,1,1));
            graph[2].add(new Edge(2,3,1));
            graph[3].add(new Edge(3,1,1));
        }

        public static void topSort(ArrayList<Edge>[] graph){
            boolean vis[] = new boolean[graph.length];
            Stack<Integer> s = new Stack<>();
            for(int i=0;i<graph.length;i++){
                if(!vis[i]){
                    topSortUtil(graph,i,vis,s);
                }
            }
            while(!s.isEmpty()){
                System.out.print(s.pop()+" ");
            }
        }

        public static void topSortUtil(ArrayList<Edge>[] graph,int curr,boolean vis[],Stack<Integer> s){
            //dfs approach (kahn's for bfs- indegree)
            vis[curr]= true;
            for (int i=0;i<graph[curr].size() ;i++ ){
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    topSortUtil(graph,e.dest,vis,s);
                }
            }
            s.push(curr);
        }
    }
