import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number:");
        int n = in.nextInt();
        int original=n;
        int ans =0;
        while(n>0){
            int rem = n % 10;
            n/=10;
            ans=ans+rem*rem*rem;
        }
        if (ans==original){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        }
    }
