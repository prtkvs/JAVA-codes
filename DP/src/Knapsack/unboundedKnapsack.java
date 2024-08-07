package Knapsack;

public class unboundedKnapsack {
    // tabulation approach
    public static int unboundedknapsackTab(int[] val, int[] wt, int W){
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
        for (int i = 0; i < dp.length; i++) {  // all 0th col = 0
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) { // all 0th row = 0
            dp[0][j]=0;
        }
        for (int i = 1; i < n+1 ; i++) {
            for (int j = 1; j < W+1 ; j++) {
                int v = val[i-1];   // ith item value
                int w = wt[i-1];    // ** ith item weight
                if (w <= j){    // valid
                    //include
                    int incProfit = val[i-1]+dp[i][j-w]; // check notes for clarity
                    // exclude
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit,excProfit);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][W]; // consider till last index of both
    }
    // DP array
    public static void print(int[][] dp){   // called in knapsackTab
        System.out.println("DP array is :- ");
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(unboundedknapsackTab(val,wt,W));
    }
}
