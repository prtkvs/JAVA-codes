package LCS;

public class recLcs {
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        System.out.println(lcs(str1,str2,str1.length(),str2.length()));
    }
    static int lcs(String str1,String str2, int n, int m){
        //base condition
        if (n==0 || m==0){
            return 0;
        }
        //same
        if (str1.charAt(n-1) == str2.charAt(m-1) ){
            return lcs(str1,str2,n-1,m-1)+1;
        }
        //different
        else{
            int ans1 = lcs(str1,str2,n,m-1);
            int ans2 = lcs(str1,str2,n-1,m);
            return Math.max(ans1,ans2);
         }
    }
}
