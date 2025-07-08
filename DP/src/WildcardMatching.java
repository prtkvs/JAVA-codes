public class WildcardMatching{
    // HARD -> O(n*m)
    public static void main(String[] args){
        String s = "abcd";
        String p = "**d";
        System.out.println(isMatch(s,p));
    }
    static boolean isMatch(String s, String p){
        int n = s.length();
        int m = p.length();
        //create table
        boolean[][] dp = new boolean[n+1][m+1];
        
        //initialize
        dp[0][0] = true;
        //p = 0 (agar pattern hi zero ho gaya to woh kabhi string nhi ban payega)
//        for (int i = 1; i <n+1 ; i++) {
//            dp[i][0]= false;
//        }
        //s=0
        for (int j = 1; j < m+1; j++) {
            if (p.charAt(j-1)=='*'){
                dp[0][j] = dp[0][j-1];
            }
            //rest else already false
        }
        //bottom up filling
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
                if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){ //NOTE: don't use double quotes for character values
                dp[i][j] = dp[i-1][j-1];
                }
                else if ( p.charAt(j-1)== '*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j]; //ignore it or take it //if any gives true therefore true
                }
                else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
}