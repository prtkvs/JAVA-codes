package CycleDetection;

import java.util.ArrayList;

public class undirectedDFS {
    static class Edge3 {      // we made this static to call this in psvm
        int src;
        int dest;

        public Edge3(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    static void createGraph(ArrayList<Edge3>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        //adding edges info at vertices
        //0 index
        graph[0].add(new Edge3(0, 1));
        graph[0].add(new Edge3(0, 3));
        graph[0].add(new Edge3(0, 2));
        // 1 index
        graph[1].add(new Edge3(1, 0));
        graph[1].add(new Edge3(1, 2));

        //2 index
        graph[2].add(new Edge3(2, 0));
        graph[2].add(new Edge3(2, 1));

        //3 index
        graph[3].add(new Edge3(3, 0));
        graph[3].add(new Edge3(3, 4));
        //4 index
        graph[4].add(new Edge3(4, 3));
    }
//    static boolean detectCycle(ArrayList<Edge3> [] graph) {
//        boolean[] vis = new boolean[graph.length];
//        for (int i = 0; i < graph.length; i++) {
//            if (!vis[i]) {
//                detectCycleutil(graph, vis,i,-1);
//                return true;
//            }
//        }
//        return false;
//    }
//    private static boolean detectCycleutil(ArrayList<Edge3>[] graph, boolean[] vis,int curr,int parent) {
//        vis[curr]=true;
//        for (int i = 0; i < graph[curr].size(); i++) {
//            Edge3 e = graph[curr].get(i);
//            //case 3
//            if (!vis[e.dest]) {
//                if (detectCycleutil(graph, vis, e.dest, curr)) {
//                    return true;
//                }
//            }
//                //case 1
//                else if (vis[e.dest] && e.dest != parent) {
//                    return true;
//                }
//            }
//            // do nothing for case 2
//        return false;
//    }
    // CORRECTED :-
static boolean detectCycle(ArrayList<Edge3>[] graph) {
    boolean[] vis = new boolean[graph.length];
    for (int i = 0; i < graph.length; i++) {
        if (!vis[i]) {
            if (detectCycleUtil(graph, vis, i, -1)) {
                return true;
            }
        }
    }
    return false;
}
    private static boolean detectCycleUtil(ArrayList<Edge3>[] graph, boolean[] vis, int curr, int parent) {
    vis[curr] = true;
    for (int i = 0; i < graph[curr].size(); i++) {
        Edge3 e = graph[curr].get(i);
        if (!vis[e.dest]) {
            if (detectCycleUtil(graph, vis, e.dest, curr)) {
                return true;
            }
        } else if (vis[e.dest] && e.dest != parent) {
            return true;
        }
    }
    return false;
}


    public static void main(String[] args) {
            int V =7;
            ArrayList<Edge3> graph[] = new ArrayList[V];
            createGraph(graph);
        System.out.println(detectCycle(graph));
        }
}
