package DP.LCS;

public class WildcardMatch {
        public static void main(String[] args) {
            System.out.println("WildCard Matching");
            String s = "baaabab";
            String p = "ba**a?";
            System.out.println(wildCard(s,p));
        }

        static boolean wildCard(String s, String p){
            int n = s.length();
            int m = p.length();
            boolean[][] dp = new boolean[n+1][m+1];
            //base case
            // s=0,p=0 - always true
            dp[0][0] = true;
            //  s=0, p!=0 - true only for *
            for (int j=1;j<m+1 ;j++ ){
                if(p.charAt(j-1)=='*'){
                    dp[0][j] = dp[0][j-1];
                }
            }
            //   s!=0, p=0 - always false //ignore since default

            //filling
            for(int i=1;i<n+1;i++){
                for(int j=1;j<m+1;j++){
                    if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?'){
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else if(p.charAt(j-1)=='*'){ //ELSE IF - big problem
                        dp[i][j] = dp[i-1][j]||dp[i][j-1];
                    }else{
                        dp[i][j] = false;
//Error- corrected (bole na kabhi bhi loop ke ander se return mt karo in Tab, dp me daalo)
                    }
                }
            }
            return dp[n][m];
        }
    }
