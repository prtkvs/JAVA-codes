package DP.LCS;

import java.util.*;
public class lcs {
        public static void main(String[] args) {
            System.out.println("Longest Common Subsequence");
            String s1 = "abdce";
            String s2 = "ace";
            int n = s1.length();
            int m = s2.length();
            int[][] dp = new int[n+1][m+1];
            for (int i=0;i<dp.length ;i++ ){
                Arrays.fill(dp[i],-1);
            }
            System.out.println(lcsMem(s1,s2,n,m,dp));
            System.out.println(lcsTab(s1,s2,n,m));
            System.out.println(lcsRec(s1,s2,n,m));
        }

        static int lcsMem(String s1, String s2, int n, int m, int[][] dp){
            if(n==0 || m==0){
                return 0;
            }
            if(dp[n][m]!=-1) return dp[n][m];
            if(s1.charAt(n-1)==s2.charAt(m-1)){
                dp[n][m] = lcsMem(s1,s2,n-1,m-1,dp)+1;
                return dp[n][m];
                //return sirf tabulation me bich me nhi likhte hai since wo loop break ho jayega
            }else{
                int ans1 = lcsMem(s1,s2,n,m-1,dp);
                int ans2 = lcsMem(s1,s2,n-1,m,dp);
                return dp[n][m] = Math.max(ans1,ans2);
            }
        }

        static int lcsTab(String s1, String s2, int n, int m){
            int[][] dp = new int[n+1][m+1];

            for(int i=1;i<n+1;i++){
                for (int j=1;j<m+1 ;j++ ){
                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1]+1;
                    }else{
                        int ans1 = dp[i-1][j];
                        int ans2 = dp[i][j-1];
                        dp[i][j] = Math.max(ans1,ans2);
                    }
                }
            }
            return dp[n][m];
        }
        static int lcsRec(String s1, String s2, int n, int m){
            if(n==0 || m==0){
                return 0;
            }
            if(s1.charAt(n-1)==s2.charAt(m-1)){
                return lcsRec(s1,s2,n-1,m-1)+1;
            }else{
                int ans1 = lcsRec(s1,s2,n,m-1);
                int ans2 = lcsRec(s1,s2,n-1,m);
                return Math.max(ans1,ans2);
            }
        }
    }