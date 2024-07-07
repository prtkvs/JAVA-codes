import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first row: ");
        int r1 = sc.nextInt();
        System.out.print("Enter first column: ");
        int c1 = sc.nextInt();
        int[][] matA = new int[r1][c1];
        System.out.println("Enter the data in matrix A:-");
        for (int i = 0; i < matA.length ; i++) {
            for (int j = 0; j <matA[i].length ; j++) {
                matA[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter second row: ");
        int r2 = sc.nextInt();
        System.out.print("Enter second column: ");
        int c2 = sc.nextInt();
        int[][] matB = new int[r2][c2];
        System.out.println("Enter the data in matrix B:-");
        for (int i = 0; i < matA.length ; i++) {
            for (int j = 0; j <matA[i].length ; j++) {
                matB[i][j] = sc.nextInt();
            }
        }
        System.out.println("First Matrix A:-");
        for (int i = 0; i < matA.length ; i++) {
            for (int j = 0; j <matA[i].length ; j++) {
                System.out.print(matA[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix B:-");
        for (int i = 0; i < matB.length ; i++) {
            for (int j = 0; j <matB[i].length ; j++) {
                System.out.print(matB[i][j]+" ");
            }
            System.out.println();
        }
        if (r1==r2 && c1==c2){
            System.out.println("Sum of MatrixA and MatrixB is :-");
            for (int i = 0; i < matA.length ; i++) {
                for (int j = 0; j <matA[i].length ; j++) {
                    int sum = matB[i][j]+matA[i][j];
                    System.out.print(sum+ " ");
                }
                System.out.println();
            }

        }
    }
}
