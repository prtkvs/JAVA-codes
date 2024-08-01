import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int [] val ={60,100,120};
        int [] weight = {10,20,30};
        int W = 50; //max weight of knapsack(sack)

        // making 2d array to sort ratio
        double[][] ratio = new double[val.length][2]; //0th col =index , 1st col = ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;    //index
            ratio[i][1] = val[i]/(double) weight[i];    // ratio
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); //lambda exp. -> sorting ratio
        int capacity =W;
        int finalVal = 0;

        //converting ratio in descending order by using loop
        for (int i = ratio.length-1; i >=0 ; i--) {
            int idx = (int)ratio[i][0]; //index typecasted into int
            if (capacity>=weight[idx]){
                finalVal += val[idx];
                capacity -= weight[idx];
            }else {
                finalVal += ratio[i][1]*capacity ; //fractional value (ratio * capacity)
                capacity =0; //capacity at the end (no need to mention)
                break;
            }
        }
        System.out.println(finalVal);
    }
}
