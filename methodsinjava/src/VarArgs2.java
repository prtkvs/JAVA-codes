import java.util.Arrays;

public class VarArgs2 {
    public static void main(String[] args) {
multiple(23,44,"pRATEEK", "PRTK", "jnv", "fdgbfsda");  //must be in the same order for the understanding of machine
    }
    static void multiple(int a , int b , String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
