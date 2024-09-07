package CycleDetection;

public class undirectedDFS {
    static class Edge {      // we made this static to call this in psvm
        int src;
        int dest;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
        }
    }
}
