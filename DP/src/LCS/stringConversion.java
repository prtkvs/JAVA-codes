package LCS;

public class stringConversion {
    public static void main(String[] args) {
        String word1 = "abcdef";
        String word2 = "aceg";
        System.out.println(lcs(word1,word2));
        System.out.println(conversion(word1,word2));
    }
    static int conversion(String str1,String str2) {
        int n = str1.length();
        int m = str2.length();
        int delete = n-lcs(str1,str2);
        int add = m- lcs(str1,str2);
        return delete+add;
    }

    static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];
        //initialisation
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = 0;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                //same
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
}
