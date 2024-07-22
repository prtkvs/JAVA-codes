package SubsetSubsequenceString;

public class skip {
    public static void main(String[] args) {
        skip("","baccadh");
        System.out.println(skip2("baccadah"));
    }
    static void skip(String p,String up){  //p=process,up= unprocessed
     if (up.isEmpty()){
         System.out.println(p);
         return;
     }
     char ch = up.charAt(0);

     if (ch=='a'){
         skip(p,up.substring(1));  //check notes about substring here 1(inclusive) from index to last print e.g "hello".substring(1) = "ello"
     }else{
         skip(p+ch,up.substring(1));  //substring used here to start again from next index after checking 0th index
     }
    }
    static String skip2(String up){
        if (up.isEmpty()){
            return ""; //check notes
        }
        char ch = up.charAt(0);

        if (ch=='a'){
            return skip2(up.substring(1));
        }else {
            return ch + skip2(up.substring(1));
        }
    }
}
