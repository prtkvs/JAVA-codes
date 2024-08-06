package Knapsack;

public class knapsack01 {
    public static void main(String[] args) {
        int [] val = {15,14,22,34,16}
        int [] wt = {1,5,2,3,6};
        int W = 7;
    }
    static int knapsack(int[] val,int[] wt,int W ,int n){ //no. of the item we're talking about
        if (n==0 || W ==0){
            return 0;
        }
    //now since first item is stored at 0th index
        if (wt[n-1]<=W){

        }
    }
}
