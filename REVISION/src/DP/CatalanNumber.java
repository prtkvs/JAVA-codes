package DP;
import java.util.*;
public class CatalanNumber {
    public static void main(String[] args) {
            System.out.println("Catalan Number");
            int n = 3;
            int[] dp = new int[n+1];
            Arrays.fill(dp,-1);
            System.out.println(catalanMem(n,dp));
            System.out.println(catalanTab(n));
            System.out.println(catalanRec(n));
        }
        static int catalanMem(int n,int[] dp) {
            if(n==0||n==1) {
                return 1;
            }
            if(dp[n]!=-1) {
                return dp[n];
            }
            int ans = 0;
            for(int i=0; i<n; i++) {
                ans += catalanMem(n-i-1,dp)*catalanMem(i,dp);
                dp[n] = ans;
            }
            return dp[n];
        }
        static int catalanTab(int n) {
            int[] dp = new int[n+1];
            dp[0] = 1;
            dp[1] = 1;

            for(int i=2; i<n+1; i++) {
                for(int j=0; j<i; j++) {
                    dp[i] += dp[j]*dp[i-j-1];
                }
            }
            return dp[n];
        }
        static int catalanRec(int n) {
            if(n==0||n==1) {
                return 1;
            }
            int ans =0;
            for(int i=0; i<n; i++) {
                ans+= catalanRec(i)*catalanRec(n-i-1);
            }
            return ans;
        }
}
