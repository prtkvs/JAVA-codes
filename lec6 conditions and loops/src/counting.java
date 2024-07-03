import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
       /* int n= 987444;
        int count = 0;
        while(n>0){
            int rem= n%10;
            if(rem==4){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);*/
        //int n = 98434;

        //using for loop


//        int count = 0;
//
//        for ( int n = 98434;n > 0; n = n / 10) {
//            int rem = n % 10;
//            if (rem == 4) {
//                count++;
//            }
//        }
//
//        System.out.println(count);
        Scanner in = new Scanner(System.in);
        int Fn = in.nextInt();
        int Sn = in.nextInt();
        if (Fn == 0 && Sn ==0) {
            System.out.println(1);
        } else {
            int count = 0;
            while (Fn > 0) {
                int rem = Fn % 10;
                if (rem == Sn) {
                    count++;
                }
                Fn /= 10;
            }
            System.out.println(count);
        }
    }
}
