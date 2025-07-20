package Backtracking;

public class GridWays {
        public static void main(String[] args) {
            System.out.println("Grid Ways");
            System.out.println(gridWays(0,0,4,5));
            System.out.println(gridWaysFormula(4, 5));
        }

        public static int gridWays(int i,int j,int n,int m){
            if(i==n-1 && j==m-1){
                return 1;
            }
            if(i==n||j==m){
                return 0;
            }

            int R = gridWays(i+1,j,n,m);
            int D = gridWays(i,j+1,n,m);
            return R+D;
        }
        // Formula based (optimised)
            public static long gridWaysFormula(int n, int m) {
                return factorial(n + m - 2) / (factorial(n - 1) * factorial(m - 1));
            }

            public static long factorial(int num) {
                long result = 1;
                for (int i = 2; i <= num; i++) {
                    result *= i;
                }
                return result;
            }
}
