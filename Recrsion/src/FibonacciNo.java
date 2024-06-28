import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n= in.nextInt();
    int ans = fibo(n);
        System.out.println(ans);
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        //here we are having an extra step of addition and returning
        //therefore this is not a tail recursion.
      return fibo(n-1)+fibo(n-2); //recurrence relation
    }
}
