package DP.LCS;

public class EditDistance {
        public static void main(String[] args) {
            System.out.println("Edit Distance");
            String s1 = "abcdef";
            String s2 = "bdeg";
            int n = s1.length();
            int m = s2.length();
            System.out.println(editDist(s1,s2,n,m));
        }

        static int editDist(String s1, String s2, int n, int m) {
            int[][] dp = new int[n+1][m+1];
            //base case :
            for(int i=0; i<n+1; i++) {
                for (int j=0; j<m+1 ; j++ ) {
                    if(i==0) {
                        dp[i][j] = j;
                    }
                    if(j==0) {
                        dp[i][j] = i;
                    }
                }
            }

            for(int i=1; i<n+1; i++) {
                for (int j=1; j<m+1 ; j++ ) {
                    if(s1.charAt(i-1)==s2.charAt(j-1)) {
                        dp[i][j] = dp[i-1][j-1];
                    } else {
                        int add = dp[i][j-1]+1;
                        int delete = dp[i-1][j]+1;
                        int replace = dp[i-1][j-1]+1;
                        dp[i][j] = Math.min(add,Math.min(delete,replace));
                    }
                }
            }
            return dp[n][m];
        }
}
