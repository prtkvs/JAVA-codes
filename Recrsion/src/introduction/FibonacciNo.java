package introduction;

public class FibonacciNo {
    public static void main(String[] args) {
        int n=4;
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
