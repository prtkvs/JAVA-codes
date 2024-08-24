package MCM;

import java.util.Arrays;

public class mcmMem {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,3};
        int n = arr.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
           Arrays.fill(dp[i],-1);  // filling -1 in dp array row wise , so sab mein bhar gaya
        }
        System.out.println(mcm(arr,1,n-1,dp));
    }
    static int mcm(int[]arr ,int i,int j,int[][]dp){
        if (i==j){  // base condition
            return 0;
        }
        if (dp[i][j] !=-1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;    // putting ans = infinity
        for (int k = i; k <=j-1 ; k++) {
            int cost1 = mcm(arr,i,k,dp);   //Ai...Ak
            int cost2 = mcm(arr,k+1,j,dp); //Ak+1...Aj
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1+cost2+cost3;
            ans = Math.min(ans,finalCost);
        }
        return ans;
    }
}
