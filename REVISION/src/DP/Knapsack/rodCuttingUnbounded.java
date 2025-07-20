package DP.Knapsack;

public class rodCuttingUnbounded {
        public static void main(String[] args) {
            System.out.println("Rod Cutting Unbounded");
            int[] price = {1,5,8,9,10,17,17,20};
            int[] length = {1,2,3,4,5,6,7,8};
            int rod = 8;
            System.out.println(rodCutting(price,length,rod));
        }

        //tabulation code with preferred variables - For Max Profit
        static int rodCutting(int[] price,int[] length,int totalRod){
            int n = price.length;
            int[][] dp = new int[n+1][totalRod+1];

            for(int i=1;i<n+1;i++){
                for(int j=1;j<totalRod+1;j++){
                    int v = price[i-1];
                    int l = length[i-1];
                    if(l<=j){
                        int include = v + dp[i][j-l]; //Unbounded
                        int exclude = dp[i-1][j];
                        dp[i][j] = Math.max(include,exclude);
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            return dp[n][totalRod];
        }
    }
