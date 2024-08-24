package CatalanNumber;

public class catalanTab {
    public static void main(String[] args) {
        int n =4;
        int[] dp =new int[n+1];
        System.out.println(catalan(n,dp));
    }
    static int catalan(int n ,int[]dp){
        //initialize
        dp[0] =1;
        dp[1] =1;


        //filling
        for (int i = 2; i <=n ; i++) {  //since will be filled till 4
            for (int j = 0; j <=i-1 ; j++) {    // calculating for Ci
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}
