package DP;

import java.util.*;
public class Fibonacci {
        public static void main(String[] args) {
            int n = 6;
            int [] dp = new int[n+1]; //n+1 since ans is at last
            Arrays.fill(dp,-1);
            System.out.println(fiboMem(n,dp));
            System.out.println(fiboTab(n));
            System.out.println(fiboRec(n));
        }
        public static int fiboMem(int n,int[] dp){ //recursion based
            if(n<2){
                return n;
            }
            if(dp[n]!=-1){ // already computed values
                return dp[n];
            }
            dp[n] = fiboMem(n-1,dp)+fiboMem(n-2,dp); //BIG-SMALL approach
            return dp[n];
        }
        public static int fiboTab(int n){
            //dp array is initialised inside the tabulation function
            int[] dp = new int[n+1];
            dp[0]=0;
            dp[1]=1;
            for (int i=2;i<n+1 ;i++ ){ // Small to BIG
                dp[i] = dp[i-1]+dp[i-2];
            }
            return dp[n];
        }
        public static int fiboRec(int n){
            if(n<2){
                return n;
            }
            return fiboRec(n-1)+fiboRec(n-2);
        }
    }
