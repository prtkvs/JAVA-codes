package Greedy;
import java.util.*;
public class FractionalKnapsack {
        public static void main(String[] args) {
            System.out.println("--------Fractional Knapsack---------");
            int[] val = {60,100,120};
            int[] wt = {10,20,30};
            int W = 50;
            double[] priority = new double[val.length];
            for (int i=0; i<val.length ; i++ ) {
                priority[i] = (double) (val[i]/wt[i]);
            }
            Integer[] idx = new Integer[val.length];
            for (int i=0; i<val.length ; i++ ) {
                idx[i] = i;
            }

            Arrays.sort(idx,(a,b)->Double.compare(priority[b],priority[a]));

            int remCapacity = W;
            double totalVal = 0;
            for (int i=0; i<val.length ; i++ ) {
                int id = idx[i];
                if (wt[id] <= remCapacity) {
                    totalVal += val[id];
                    remCapacity -= wt[id];
                }else{
                    totalVal += priority[id]*remCapacity;
                    break; //DOUBT - cleared
                }
            }
            System.out.print(totalVal);
        }
    }
