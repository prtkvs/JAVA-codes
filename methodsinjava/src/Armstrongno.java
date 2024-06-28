import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();
        boolean ans= isArmstrong(n);
        System.out.println(ans);
    }
    static boolean isArmstrong(int n){
        int ans =0;
        int original=n;
        while(n>0){
            int rem = n % 10;
            n/=10;
            ans=ans+rem*rem*rem;
        }
        if (ans==original){
            return true;
        }
        else {
            return false;
        }
    }
}
