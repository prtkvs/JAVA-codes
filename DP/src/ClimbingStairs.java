import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n =5;
        int [] dp = new int [n+1]; // 0 0 0 0
        Arrays.fill(dp,-1); // -1 -1 -1 -1
        System.out.println(countWays(n,dp));
        System.out.println(waysTab(n));
    }
    // Memoization
    private static int countWays(int n,int[] dp) {
        if (n==0){
            return 1;
        }
        if (n<0){
            return 0;
        }
        if (dp[n]!=-1){
            return dp[n];
        }
        dp[n] = countWays(n-1,dp)+countWays(n-2,dp);
        // for climbing 1 , 2 and 3 stairs :- (similarly correct for other cases scenario)
        //dp[n] = countWays(n-1,dp)+countWays(n-2,dp)+countWays(n-3,dp);
        return dp[n];
    }
    // Tabulation
    static int waysTab(int n){
        int[] dp = new int[n+1];
        dp[0]=1;
        for (int i = 1; i <=n ; i++) {
            if (i==1){
                dp[i] = dp[i-1];
            }else {
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
}
