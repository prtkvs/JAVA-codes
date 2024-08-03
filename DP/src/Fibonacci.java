public class Fibonacci {
    public static void main(String[] args) { //0(n) linear from exponential
        int n = 6;
        int[] f = new int[n+1]; //from 0th fib to nth fib therefore n+1
        System.out.println(fib(n,f));
        System.out.println(fibTab(6));
    }
    static int fib(int n, int[] f){
            if (n<2){
                return n;
            }
            //if fib is already calculated
        if (f[n]!=0){
            return f[n];
        }
        //storing already calculated values inside array
        f[n] = fib(n-1,f)+fib(n-2,f);
        return f[n];
    }
    static int fibTab(int n){
        int[] dp = new int[n+1];
//        dp[0]=0;   //no need to mention default already stored in java(not in c++)
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n]; //ans
    }
}
