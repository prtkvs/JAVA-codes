package LCS;

public class editDistance {
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(editDist(word1,word2));
    }
    static int editDist(String str1 , String str2){
        int n = str1.length();
        int m = str2.length();
        // creating a table
        int[][] dp = new int[n+1][m+1];
        //initialisation
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if (i==0){
                    dp[i][j]=j;
                }
                if (j==0){
                    dp[i][j]=i;
                }
            }
        }
        //filling (bottom up manner)
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
                //same
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    int add = dp[i][j-1]+1;
                    int delete = dp[i-1][j]+1;
                    int replace = dp[i-1][j-1]+1;
                    dp[i][j]= Math.min(add,Math.min(delete,replace));
                }
            }
        }
        return dp[n][m];
    }
}