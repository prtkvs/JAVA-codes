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
//        System.out.print("Enter your name:");
//        String name = in.nextLine();
        String name = "Kunal";
        System.out.println(myGreet(name));
    }

    static String myGreet(String naam) {
        naam = "Prateek";   // updated
        return naam;
    }
}
