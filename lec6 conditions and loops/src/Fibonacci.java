import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int count = 2;
        if (n == 0) {
            System.out.println(0);
        } else {
            while (count <= n) {
                int temp = b;
                b = b + a;
                a = temp;
                count++;
            }
            System.out.println(b);
        }
    }
}
