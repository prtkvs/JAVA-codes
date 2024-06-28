import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[] arr = new int[5];
        //array of primitives
//        arr[0]=2;
//        arr[1]=4;
//        arr[2]=33;
//        arr[3]=42;
//        arr[4]=41;
        //{2,4,33,42,41}
//        System.out.println(arr[3]);
        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
        //output using for loops first way
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
// also syntax  second way
//
//            for (int num : arr) { //for every element in array print the element
//                System.out.print(num + " "); //here num represent element of the array
//            }
//third way
//        System.out.println(Arrays.toString(arr));
        //array of objects
        String[] str = new String[4];
        for(int i = 0 ; i<str.length ; i++){
            str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
