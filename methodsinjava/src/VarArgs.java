import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,2,23,23,233,232,323,32,23,23,23,43);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
