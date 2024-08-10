import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your name:");
        String name= in.nextLine();
        String personalized = greeting(name);
        System.out.println(personalized);
    }
    static String greeting(String naam){
        String message = "hello "+ naam;
        return message;
    }
}
