package DP;
import java.util.*;
public class MCM {
    public static void main(String[] args){
            System.out.println("Matrix Chain Multiplication");
            int[] arr ={1,2,3,4,3};
            int n = arr.length;
            int[][] dp = new int[n][n];
            for(int i=0;i<n;i++){
                Arrays.fill(dp[i],-1);
            }
            System.out.println(mcmMem(arr,1,n-1,dp));
            System.out.println(mcmRec(arr,1,n-1));
        }

        public static int mcmMem(int[] arr, int i, int j, int[][]dp){
            if(i==j){
                return 0;
            }
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            int ans = Integer.MAX_VALUE;
            for(int k=i;k<=j-1;k++){
                int cost1 = mcmMem(arr,i,k,dp);
                int cost2 = mcmMem(arr,k+1,j,dp);
                int cost3 = arr[i-1]*arr[k]*arr[j];
                int finalCost = cost1+cost2+cost3;
                ans = Math.min(ans,finalCost);
                dp[i][j] = ans;
            }
            return dp[i][j];
        }
        public static int mcmRec(int[] arr, int i, int j){
            if(i==j){
                return 0;
            }
            int ans = Integer.MAX_VALUE;
            for(int k=i;k<=j-1;k++){
                int cost1 = mcmRec(arr,i,k);
                int cost2 = mcmRec(arr,k+1,j);
                int cost3 = arr[i-1]*arr[k]*arr[j];
                int finalCost = cost1+cost2+cost3;
                ans = Math.min(ans,finalCost);
            }
            return ans;
        }
}
