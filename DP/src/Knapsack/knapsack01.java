package Knapsack;

public class knapsack01 {
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {1, 5, 1, 3, 4};
        int W = 7;
        System.out.println(knapsack(val, wt, W, val.length)); // val.length since going from last to 0
    }

    public static int knapsack(int[] val, int[] wt, int W, int n) { //no. of the item we're talking about
        if (n == 0 || W == 0) {
            return 0;
        }
        //now since first item is stored at 0th index
        if (wt[n - 1] <= W) {    // valid
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);
            // exclude
            int ans2 = knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        }
        // not valid (exclude)
        return knapsack(val, wt, W, n - 1);
    }
}
