import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
//        for (int num=1;num<=n;num++){
//            System.out.print(num+" ");
//        }
        int num=1;
        while(num<=n){
            System.out.println(num);
            num++;
        }
    }
}
