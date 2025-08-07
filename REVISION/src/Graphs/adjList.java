package Graphs;
//Adjacency List, BFS , DFS
import java.util.*;
public class adjList {
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
        int V = 7; //V = vertex
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph,V);
        for (int i=0; i<graph[2].size() ; i++ ) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println();
        bfs(graph);
        System.out.println();
        dfs(graph,0,new boolean[V]);
    }

    public static void createGraph(ArrayList<Edge>[] graph, int V) {
        for (int i=0; i<V; i++ ) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,5,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,6,1));
        graph[6].add(new Edge(6,5,1));
    }

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        //add first element
        q.add(0);
        while(!q.isEmpty()) {
            int curr = q.poll();

            //check when to visit
            if(!vis[curr]) {
                System.out.print(curr+ " "); //Error-cleared(print if unvisited)
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis){
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
}