package Greedy;
import java.util.*;
public class DiffPairs {
    public static void main(String[] args) {
            System.out.println("--------Min. Abs Diff. Pairs Sum--------");
            int[] a = {11,23,32};
            int[] b = {23,33,11};

            Arrays.sort(a);
            Arrays.sort(b);

            int minDiff = 0;
            for (int i =0; i<a.length ; i++ ) {
                minDiff += Math.abs(a[i]-b[i]);
            }

            System.out.print(minDiff);
        }
    }
