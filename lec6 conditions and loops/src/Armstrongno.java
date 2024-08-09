import java.util.Scanner;

public class Armstrongno {    //e.g 153 => 1^3+5^3+3^3=153 Yes!
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number:");
        int n = in.nextInt();
        int original=n;     // since n ka value change ho jayega
        int ans =0;
        while(n>0){
            int rem = n % 10;
            ans=ans+rem*rem*rem;
            n/=10;
        }
        if (ans==original){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        }
    }
