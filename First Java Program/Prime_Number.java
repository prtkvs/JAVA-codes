import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a number:");
        int n= input.nextInt();
        if(n<=1){
            System.out.println("Neither prime nor composite");
            return;
        }
        if(n==2){
            System.out.println("Special Prime Number");
            return;
        }
        if(n%2==0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
