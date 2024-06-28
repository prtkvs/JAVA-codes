import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select first number:");
        float num1 = in.nextFloat();
        System.out.print("Select second number:");
        float num2 = in.nextFloat();
        System.out.print("Select operator(+ - * /): ");
        char op = in.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            if (op == '+') {
                float result = num1 + num2;
                System.out.println(result);
            }
            if (op == '-') {
                float result = num1 - num2;
                System.out.println(result);
            }
            if (op == '*') {
                float result = num1 * num2;
                System.out.println(result);
            }
            if (op == '/') {
                float result = num1 / num2;
                System.out.println(result);
            }
        }
        else{
            System.out.println("wrong operator entered");
        }
    }
}
