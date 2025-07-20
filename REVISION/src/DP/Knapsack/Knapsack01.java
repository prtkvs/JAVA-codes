package DP.Knapsack;
import java.util.*;
public class Knapsack01 {
        public static void main(String[] args) {
            System.out.println("Hello Knapsack 0/1");
            int[] val = {100,50,30,25,5,15};
            int[] wt = {10,5,2,1,1,1};
            int n = val.length;
            int W = 10;
            int[][] dp = new int[n+1][W+1]; //Problem - cleared (size sahi karo)
            //not using arrays.fill since at 0th col and 0th index me 0 hoga
            for (int i=1; i<dp.length; i++) {
                for(int j=1; j<dp[0].length; j++) {
                    dp[i][j] = -1;
                }
            }
            System.out.println(knapsackMem(val,wt,n,W,dp));
            System.out.println(knapsackTab(val,wt,n,W));
            System.out.println(knapsackRec(val,wt,n,W));
        }

        static int knapsackMem(int[] val,int[] wt, int n, int W, int[][]dp) {
            if(n==0 || W ==0) {
                return 0;
            }
            if(dp[n][W]!=-1) {
                return dp[n][W];
            }
            if(wt[n-1]<=W) { //valid
                int include = val[n-1]+knapsackMem(val,wt,n-1,W-wt[n-1],dp);
                int exclude = knapsackMem(val,wt,n-1,W,dp);
                dp[n][W] = Math.max(include,exclude);
            } else {
                dp[n][W] = knapsackMem(val,wt,n-1,W,dp);
                return dp[n][W];
            }
            return dp[n][W];
        }

        static int knapsackTab(int[] val,int[] wt,int n,int W) {
            int[][] dp = new int [n+1][W+1];
            for (int i=1; i<n+1 ; i++ ) {
                int v = val[i-1];
                int w = wt[i-1];
                for (int j=1; j<W+1 ; j++ ) {
                    //valid
                    if(w<=j) {
                        int include = v + dp[i-1][j-w];
                        int exclude = dp[i-1][j];
                        dp[i][j] = Math.max(include,exclude);
                        // return dp[i][j];  Dont return in middle in tab
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            return dp[n][W];
        }

        static int knapsackRec(int[]val,int[]wt,int n,int W) {
            if(n==0||W==0) {
                return 0;
            }
            if(wt[n-1]<=W) {
                int include = val[n-1]+knapsackRec(val,wt,n-1,W-wt[n-1]);
                int exclude = knapsackRec(val,wt,n-1,W);
                return Math.max(include,exclude);
            }
            else {
                return knapsackRec(val,wt,n-1,W);
            }

        }
    }
