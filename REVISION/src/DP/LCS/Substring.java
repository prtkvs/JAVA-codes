package DP.LCS;

import java.util.*;
public class Substring {
        public static void main(String[] args) {
            System.out.println("Longest Common Substring");
            String s1 = "abdce";
            String s2 = "ace";
            int n = s1.length();
            int m = s2.length();
            System.out.println(substring(s1,s2,n,m));
        }

        static int substring(String s1, String s2, int n, int m){
            int[][] dp = new int[n+1][m+1];

            for(int i=1;i<n+1;i++){
                for (int j=1;j<m+1 ;j++ ){
                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1]+1;
                    }else{
                        dp[i][j]=0;
                    }
                }
            }
            return dp[n][m];
        }
}
