package Backtracking;

public class Permutations {
        public static void main(String[] args) {
            System.out.println("Permutations");
            permutations("abc","");
        }

        public static void permutations(String s, String ans){
            //base case :
            if(s.length()==0){
                System.out.println(ans);
                return; //backtrack
            }
            for(int i=0;i<s.length();i++){
                char curr = s.charAt(i);
                String NewStr = s.substring(0,i)+s.substring(i+1,s.length());
                permutations(NewStr,ans+curr);
            }
        }
}
