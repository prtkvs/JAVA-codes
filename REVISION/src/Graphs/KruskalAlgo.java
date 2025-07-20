package Graphs;
import java.util.*;
public class KruskalAlgo {
        static class Edge implements Comparable<Edge> {
            int src;
            int dest;
            int wt;
            public Edge(int src,int dest, int wt) {
                this.src = src;
                this.dest = dest;
                this.wt = wt;
            }
            @Override
            public int compareTo(Edge e2){
                return this.wt-e2.wt; //weight based sorting
            }
        }


        public static void main(String[] args) {
            System.out.println("Kruskal's Algorithm");
            int V = 4;
            ArrayList<Edge> edges = new ArrayList<>();
            createEdge(edges,V);
            kruskals(edges,V);
        }

        public static void createEdge(ArrayList<Edge> edges, int V) {
            //not a graph to represent directed/undirected
            //edges are only mentioned once if they are in undirected
            edges.add(new Edge(0, 1, 10));
            edges.add(new Edge(0, 2, 15));
            edges.add(new Edge(0, 3, 30));
            edges.add(new Edge(1, 3, 40));
            edges.add(new Edge(2, 3, 50));
        }
        static int V = 4;
        static int[] par = new int[V];
        static int[] rank = new int[V];

        public static void initialise(){
            for (int i=0;i<V ;i++ ){
                par[i] = i;
            }
        }

        public static int find(int v){
            if(v==par[v]) return v;
            return par[v] = find(par[v]);
        }

        public static void union(int a,int b){
            int parA = find(a);
            int parB = find(b);
            if(rank[parA]==rank[parB]){
                par[parB] = parA;
                rank[parA]++;
            }
            else if(rank[parA]<rank[parB]){
                par[parA] = parB;
            }
            else{
                par[parB] = parA;
            }
        }

        public static void kruskals(ArrayList<Edge> edges, int V){
            initialise();
            Collections.sort(edges); //check
            int mstCost=0;
            for(int i=0;i<V-1;i++){
                Edge e = edges.get(i);
                int parA = find(e.src);
                int parB = find(e.dest);

                //if cycle does'nt exists
                if(parA!=parB){
                    union(parA,parB);
                    mstCost+=e.wt;
                }
            }
            System.out.println(mstCost);
        }
}
