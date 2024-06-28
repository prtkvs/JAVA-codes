import java.util.Scanner;

public class largestno {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter three values with spaces:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //Method1:Basic Approach
        /*int max=a;
        if(b>a){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
        */
        //Method2:JAVA Special
        int max= Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
