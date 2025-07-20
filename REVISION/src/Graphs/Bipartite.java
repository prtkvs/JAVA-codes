package Graphs;

import java.util.*;
public class Bipartite {
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
            System.out.println("Bipartite Graph");
            int V = 7; //V = vertex
            ArrayList<Edge>[] graph = new ArrayList[V];
            createGraph(graph,V);
            System.out.println(isBipartite(graph));

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
            graph[2].add(new Edge(2,3,1));
            graph[3].add(new Edge(3,1,1));
            graph[3].add(new Edge(3,2,1));
        }

        public static boolean isBipartite(ArrayList<Edge>[] graph) {
            int[] color = new int[graph.length];
            for(int i=0; i<color.length; i++) {
                color[i]=-1; // no color initialised
            }
            Queue<Integer> q = new LinkedList<>();

            for (int i=0; i<graph.length ; i++ ) {
                if(color[i]==-1) {
                    q.add(i);
                    color[i] = 0; //start

                    while(!q.isEmpty()) {
                        int curr = q.poll();
                        for (int j=0; j<graph[curr].size() ; j++ ) {
                            Edge e = graph[curr].get(j);
                            if(color[e.dest]==-1) {
                                if(color[curr]==0) {
                                    color[e.dest]=1;
                                }
                                else if(color[curr]==1) {
                                    color[e.dest]=0;
                                }
                                q.add(e.dest);
                            }
                            //case:1 Same color (at-last since pehle assign karo)
                            else if(color[curr]==color[e.dest]) {
                                return false;
                            }

                        }
                    }
                }
            }
            return true;
        }
    }
