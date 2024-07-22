package SubsetSubsequenceString;

import java.util.ArrayList;

public class subSequence {
    public static void main(String[] args) {
        System.out.println(subseqReturn("","abc"));
    }
    static void subseq(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(ch+p,up.substring(1));       //written first so called first left side
        subseq(p,up.substring(1));          //after left side is called then right side
    }
    static ArrayList<String> subseqReturn(String p,String up){      //Check recursion Arrays lecture of declaring Arraylist in body(we have already discussed about it on argument)
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String>left = subseqReturn(ch+p,up.substring(1));
        ArrayList<String> right = subseqReturn(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
