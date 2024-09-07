import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class connectedComponents {
    static class Edge2{      // we made this static to call this in psvm
        int src;
        int dest;
        int wt;

        public Edge2(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void createGraph(ArrayList <Edge2>[]graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        //adding edges info at vertices
        //0 index
        graph[0].add(new Edge2(0,1,1));

        // 1 index
        graph[1].add(new Edge2( 1,0,5));
        graph[1].add(new Edge2(1,3,1));

        //2 index
        graph[2].add(new Edge2(2,0,1));
        graph[2].add(new Edge2(2,4,1));

        //3 index
        graph[3].add(new Edge2(3,2,1));
        graph[3].add(new Edge2(3,4,1));
        graph[3].add(new Edge2(3,5,1));

        //4 index
        graph[4].add(new Edge2(4,2,1));
        graph[4].add(new Edge2(4,3,1));
        graph[4].add(new Edge2(4,5,1));

    }
    static void bfsutil(ArrayList<Edge2>[] graph,boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);   // source: 0
        if (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.println(curr + " ");   // visit current
                vis[curr] = true;
                //visiting neighbours code (covered)
            }
        }
    }
    static void bfs(ArrayList<Edge2>[] graph){
            boolean[] vis = new boolean[graph.length];
            for (int i = 0; i < graph.length; i++) {
                if (!vis[i]){
                    bfsutil(graph,vis);
                }
            }
        }
    public static void main(String[] args) {
        int V =7;
        ArrayList<Edge2> graph[] = new ArrayList[V];
        createGraph(graph);
    }
}
