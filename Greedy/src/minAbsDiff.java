import java.util.Arrays;

public class minAbsDiff {
    public static void main(String[] args) {
        int[] A ={4,6,8,2};
        int[] B ={3,9,5,8};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff =0;
        for (int i = 0; i < B.length; i++) {
            minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println(minDiff);
    }
}
