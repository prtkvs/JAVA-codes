import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        //similarly check for others of name.(select any option)
        System.out.println(name.indexOf('a'));
        System.out.println("    kunal   " .strip());
        String split= "Prateek Verma Hello World";
        System.out.println(Arrays.toString(split.split(" ")));
    }
}
