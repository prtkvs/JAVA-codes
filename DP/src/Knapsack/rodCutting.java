package Knapsack;

public class rodCutting {
    // tabulation approach
    public static int rodCuttingTab(int[] price, int[] length, int totalRod){
        int n = price.length;
        int[][] dp = new int[n+1][totalRod+1];
        for (int i = 0; i < dp.length; i++) {  // all 0th col = 0
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) { // all 0th row = 0
            dp[0][j]=0;
        }
        for (int i = 1; i < n+1 ; i++) {
            for (int j = 1; j < totalRod+1 ; j++) {
                int v = price[i-1];   // ith item value
                int w = length[i-1];    // ** ith item weight
                if (w <= j){    // valid
                    //include
                    int incProfit = price[i-1]+dp[i][j-w]; // check notes for clarity
                    // exclude
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit,excProfit);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][totalRod]; // consider till last index of both
    }
    public static void main(String[] args) {
        int[] price = {1,5,8,9,10,17,17,20};
        int[] length = {1,2,3,4,5,6,7,8};
        int totalRod = 8;
        System.out.println(rodCuttingTab(price,length,totalRod));
    }
}
