import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans = sum2(); //calling sum2
        System.out.println(ans);
        sum();
    }

    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = input.nextInt();
        System.out.print("Enter second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum; //to get output
        // System.out.println("this will never execute"); anything written after return
        //statement it will never execute.
    }
    //no usages (if not called)
    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = input.nextInt();
        System.out.print("Enter second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum=" + sum);
    }
}