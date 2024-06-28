import java.util.Scanner;

public class returningstring {
    //    public static void main(String[] args) {
//    String personalized= myGreet("Prateek Verma");
//        System.out.println(personalized);
//
//    }
//
//    static String myGreet(String name) {
//        String message= "hello " + name;
//        return message;
//    }
//}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.nextLine();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message = "hello " + name;
        return message;
    }
}
