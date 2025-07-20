package DP.Knapsack;
import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
            System.out.println("Target Sum Subset 0/1");
            int[] arr = {4,2,7,1,3};
            int sum = 10;
            System.out.println(targetSum(arr,sum));
        }
        static boolean targetSum(int[]arr,int sum) {
            int n = arr.length;
            boolean[][] dp = new boolean[n+1][sum+1];
            //if sum is 0 therefore always true, except items = 0
            for(int i=1; i<dp.length; i++) {
                dp[i][0] = true;
            }
            for(int i=1; i<n+1; i++) {
                int v = arr[i-1];
                for(int j=1; j<sum+1; j++) {
                    if(v<=j && dp[i-1][j-v]==true) { //include
                        dp[i][j]= true;
                    }
                    if(dp[i-1][j]) {   //exclude
                        dp[i][j] = true;
                    } // Problem - dont write else since already if not to wo false hi hai
                }
            }
            return dp[n][sum];
        }
    }
