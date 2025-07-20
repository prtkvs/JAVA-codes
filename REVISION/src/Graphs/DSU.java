package Graphs;

public class DSU{
    static int V = 7;
    static int[] par = new int[V];
    static int[] rank = new int[V];

    public static void initialise(){ //cannot directly write for loop here
        for(int i=0;i<par.length;i++){
            par[i] = i; //self parents in start
        }
    }

    public static int find(int v){
        if(v==par[v]){
            return v;
        }
        return par[v] = find(par[v]);
    }

    public static void union(int a,int b){
        //get parents
        int parA = find(a);
        int parB = find(b);

        //connections
        if(rank[parA]==rank[parB]){
            //connect anyone
            par[parB] = parA;   //A-->B
            rank[parA]++;
        }
        else if(rank[parA]<rank[parB]){
            par[parA] = parB;
        }
        else{
            par[parB] = parA;
        }
    }

    public static void main(String[] args){
        initialise();
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        union(1,5);
        System.out.println(find(2));
    }
}
