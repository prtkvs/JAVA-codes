import java.util.Scanner;

public class Main {     //calling sum
    public static void main(String[] args) {
        int ans = sum2(); //for int, we have to determine a variable and get output in the call itself.
        System.out.println(ans);
    }

    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = input.nextInt();
        System.out.print("Enter second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum; //in order to initiate towards call, to get output
        // System.out.println("this will never execute"); anything written after return
        //statement it will never execute.
    }
    //no usages
    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = input.nextInt();
        System.out.print("Enter second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum=" + sum);
//        }
    }
}