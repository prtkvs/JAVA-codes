import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+ 'b');  //195
        System.out.println("a"+"b");  //ab
        System.out.println('a'+3);   //100
        System.out.println((char)('a'+3));  //d
        System.out.println("a"+1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()
        System.out.println("Kunal"+ new ArrayList<>());
        System.out.println("Kunal"+ new Integer(56));
        System.out.println("Kunal"+56);
        //System.out.println(new Integer(56)+new ArrayList<>()); //+ operator can only used with
        // primitives and complex objects as well but the only condition is atleast one of
        // these should be a type string.
        String ans = new Integer(56)+""+new ArrayList<>(); //"" is an empty string
        System.out.println(ans);
    }
}
