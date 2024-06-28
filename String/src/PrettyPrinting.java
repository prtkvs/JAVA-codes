import java.sql.SQLOutput;

public class PrettyPrinting {
    public static void main(String[] args) {
        float f = 2.3456f;
        System.out.printf("Formatted number is %.2f",f);
        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("Formatted number is %.2f", Math.PI);
        System.out.println();
        System.out.printf("hello my name is %s and I am %s", "Prateek","Cool");
    }
}
