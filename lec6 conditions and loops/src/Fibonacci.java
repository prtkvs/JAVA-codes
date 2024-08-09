import java.util.Scanner;

public class Fibonacci {  //0,1,1,2,3,5,8,13,.....
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
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
