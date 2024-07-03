import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String[] s={"h","e","l","l","o"};
        reverse(s);
        System.out.println(Arrays.toString(s));
    }
    static void reverse(String[] s){
        int start =0;
        int end = s.length-1;
        while(start<end){
            swap(s,start,end);
            start++;
            end--;
        }
    }
    static void swap(String[] s , int index1,int index2){
        String temp = s[index2];
        s[index2]=s[index1];
        s[index1]=temp;
    }

}
