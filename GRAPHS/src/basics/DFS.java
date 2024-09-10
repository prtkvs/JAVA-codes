package basics;

import java.util.ArrayList;

public class DFS {
            static class Edge {      // we made this static to call this in psvm
                int src;
                int dest;
                int wt;

                public Edge(int src, int dest, int wt) {
                    this.src = src;
                    this.dest = dest;
                    this.wt = wt;
                }
            }


            static void createGraph(ArrayList<Edge>[] graph) {
                for (int i = 0; i < graph.length; i++) {
                    graph[i] = new ArrayList<>();
                }

                //adding edges info at vertices
                //0 index
                graph[0].add(new Edge(0, 1, 1));

                // 1 index
                graph[1].add(new Edge(1, 0, 5));
                graph[1].add(new Edge(1, 3, 1));

                //2 index
                graph[2].add(new Edge(2, 0, 1));
                graph[2].add(new Edge(2, 4, 1));

                //3 index
                graph[3].add(new Edge(3, 2, 1));
                graph[3].add(new Edge(3, 4, 1));
                graph[3].add(new Edge(3, 5, 1));

                //4 index
                graph[4].add(new Edge(4, 2, 1));
                graph[4].add(new Edge(4, 3, 1));
                graph[4].add(new Edge(4, 5, 1));

            }

            public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] vis) {
                System.out.print(curr+" ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    if (!vis[e.dest]){      // e.dest = neighbour
                        dfs(graph,e.dest,vis);
                    }
                }
            }
    public static void main(String[] args) {
        int V =7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dfs(graph,0,new boolean[V]);
    }
}
