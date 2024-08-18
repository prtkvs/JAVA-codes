package Knapsack;

public class targetSum01 {
    public static boolean targetSumSubset(int[] arr,int sum){
        int n = arr.length;     // no. of items
        boolean[][] dp = new boolean[n+1][sum+1];
        //initializing
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = true; // since if the weight are zero then by taking null set we can achieve that
        }
        for (int i=1; i<n+1 ; i++){
            for (int j = 1; j < sum+1; j++) {
                int v = arr[i-1]; // value
                // include
                if (v<=j && dp[i-1][j-v] == true ){
                    dp[i][j] = true;
                }
                //exclude
                if (dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }
    public static void print(boolean[][] dp){   // called in knapsackTab
        System.out.println("DP array is :- ");
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={4,2,7,1,3};
        System.out.println(targetSumSubset(arr,10));
    }
}
