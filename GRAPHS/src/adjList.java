import java.util.*;

public class adjList {
    static class Edge{      // we made this static to call this in psvm
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {
        int V =5;   // vertices
        ArrayList<Edge>[] graph = new ArrayList[V]; // array of arraylist //same as int[] arr = new int[V] -> this is called array of int

        //adding arraylist to all index of graph array
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        //adding edges info at vertices
        //0 index
        graph[0].add(new Edge(0,1,5));

        // 1 index
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        //2 index
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        //3 index
        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3,1,3));

        //4 index
        graph[4].add(new Edge(4,2,2));

        //neighbours

        //2s neighbours
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
        }
    }
}
