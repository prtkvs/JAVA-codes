package Greedy;

public class ActivitySelection
{
    public static void main(String[] args) {
        System.out.println("------Activity Selection------");
        int[] start = {10,12,20};
        int[] end = {20,25,30};
        int maxAct = 1;
        int lastEnd = end[0];
        for (int i=1; i<end.length ; i++ ) {
            if (start[i]>=lastEnd) {
                maxAct++;
                lastEnd = end[i];
            }
        }
        System.out.println(maxAct);
    }
}
