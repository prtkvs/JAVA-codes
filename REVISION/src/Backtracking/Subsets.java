package Backtracking;

public class Subsets {
        public static void main(String[] args) {
            System.out.println("Subsets");
            subsets("abc","",0);
        }

        public static void subsets(String s, String ans,int i){
            //base case :
            if(i==s.length()){
                System.out.println(ans);
                return; //backtrack
            }

            //Yes
            subsets(s,ans+s.charAt(i),i+1);
            //NO
            subsets(s,ans,i+1);
        }
}
