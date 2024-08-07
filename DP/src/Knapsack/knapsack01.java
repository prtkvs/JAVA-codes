package Knapsack;

public class knapsack01 {
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {1, 5, 1, 3, 4};
        int W = 7;
        int[][] dp = new int[val.length+1][W+1];  //n+1,W+1
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsack(val, wt, W, val.length)); // val.length since going from last to 0
        System.out.println(knapsackmemo(val, wt, W, val.length,dp));
    }
// recursive approach O(2^n)
    public static int knapsack(int[] val, int[] wt, int W, int n) { //no. of the item we're talking about
        if (n == 0 || W == 0) {
            return 0;
        }
        //now since first item is stored at 0th index
        if (wt[n - 1] <= W) {    // valid
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);
            // exclude
            int ans2 = knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        }
        // not valid (exclude)
        return knapsack(val, wt, W, n - 1);
    }

    // memoization O(n*W)
    public static int knapsackmemo(int[] val, int[] wt, int W, int n,int[][] dp) { //no. of the item we're talking about
        if (n == 0 || W == 0) {
            return 0;
        }
        if (dp[n][W]!=-1){ // already stored
            return dp[n][W];
        }
        //now since first item is stored at 0th index
        if (wt[n - 1] <= W) {    // valid
            // include
            int ans1 = val[n - 1] + knapsackmemo(val, wt, W - wt[n - 1], n - 1,dp);
            // exclude
            int ans2 = knapsackmemo(val, wt, W, n - 1,dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        }
        // not valid (exclude)
        dp[n][W]= knapsackmemo(val, wt, W, n - 1,dp);
        return dp[n][W];
    }
}
