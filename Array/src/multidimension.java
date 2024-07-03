import java.util.Arrays;
import java.util.Scanner;

public class multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); //gives no of rows (only)
        //input
        System.out.println("enter the matrix:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
        System.out.println("Given matrix is:" + " ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
            //ALSO
//        for (int row=0; row < arr.length; row++) {
//        System.out.print(Arrays.toString(arr[row]));
//            System.out.println();
//        }
//            System.out.println(arr[2][1]); //specifies third row 2nd column
    }
}