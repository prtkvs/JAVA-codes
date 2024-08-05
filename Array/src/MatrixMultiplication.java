import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first row: ");
        int r1 = sc.nextInt();
        System.out.print("Enter first column: ");
        int c1 = sc.nextInt();
        System.out.println("Enter the data in matrix A:-");
        int[][] one = new int[r1][c1];
        for (int i = 0; i <one.length ; i++) {
            for (int j = 0; j <one[i].length ; j++) {   //colums aldp depends on row
                one[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter second row: ");
        int r2 = sc.nextInt();
        System.out.print("Enter second column: ");
        int c2 = sc.nextInt();
        System.out.println("Enter the data in matrix B:-");
        int[][] two = new int[r2][c2];
        for (int i = 0; i <two.length ; i++) {
            for (int j = 0; j <two[i].length ; j++) {
                two[i][j] = sc.nextInt();
            }
        }
        if (c1!=r2){
            System.out.println("Invalid Input");
        }
        int[][] prd = new int[r1][c2];
        for (int i = 0; i < prd.length ; i++) {
            for (int j = 0; j <prd[i].length ; j++) {
                for (int k = 0; k <c1; k++) {
                    prd[i][j] += one[i][k] * two[k][j];
                }
            }
        }
        for (int i = 0; i < prd.length ; i++) {
            for (int j = 0; j <prd[i].length ; j++) {
                System.out.print(prd[i][j]+ " ");
                }
            System.out.println();
        }
    }
}
