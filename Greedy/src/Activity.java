import java.util.ArrayList;

public class Activity {
    public static void main(String[] args) {
        int[] start ={1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9}; //already sorted

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        maxAct =1;

        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i]>=lastEnd){     // condition for non-overlapping
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activities:"+ maxAct);  // dont use comma ","
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
