public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){
        if(n==5){
            System.out.println(5);
            return; //mtlab dont call anything
        }
        System.out.println(n);
        //recursive call
        //if you are calling again and again, you can treat it as a separate call in the stack

        //this is called tail recursion
        //since, this is the last function call
        print1(n+1);
    }
}
