public class searchStrings {
    public static void main(String[] args) {
        String name = "Alexander";
        char target = 'p';
        System.out.println(search(name,target));
    }
    static boolean search(String str,char target){
        if (str.length()==0){         //in case of str.length is a function of type array only but arr.length is a variable
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)){        //same as for arr[i];
                return true;
            }
        }
        return false;
    }
}
