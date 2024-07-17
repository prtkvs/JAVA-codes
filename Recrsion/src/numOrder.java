public class numOrder {
    public static void main(String[] args) {
        numDsc(5);
        System.out.println();
        numAsc(5);
        System.out.println();
        System.out.println("Factorial: " + fact(5));
        System.out.println("Sum: "+ sum(5));
        System.out.println("Sum of Digits: " + sumDigit(1342));
        System.out.println("Product of Digits: " + prodDigit(505));
        concept(5);
    }
    static void numAsc(int n){
        if (n==0){
            return;
        }
        System.out.print(n);
        numAsc(n-1);
    }
    static void numDsc(int n){
        if (n==0){
            return;
        }
        numDsc(n-1);
        System.out.print(n);  //V.easy think (ya debug kr ke check kr lo)
    }
    static int fact(int n){
        if (n==0 || n==1){      //giving the base condition is necessary
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if (n==1){
            return 1;
        }
        if (n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    static int sumDigit(int n){
        if (n==0){
            return 0;
        }
        return (n%10) +sumDigit(n/10);
    }
    static int prodDigit(int n){
//        if (n==0){               // alternate base condition
//            return 1;
//        }
        if (n%10==n){
            return n;
        }
        return (n%10)*(prodDigit(n/10));
    }
    static void concept(int n){
        if (n==0){
            return;
        }
        System.out.print(n);   //54321
        concept(--n);   //if used n-- then stack overflow check notes
    }
}
