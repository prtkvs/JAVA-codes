package MCM;

public class mcmRec {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,3};
        int n = arr.length;
        System.out.println(mcm(arr,1,n-1));
    }
    static int mcm(int[]arr ,int i,int j){
        if (i==j){  // base condition
            return 0;
        }
        int ans = Integer.MAX_VALUE;    // putting ans = infinity
        for (int k = i; k <=j-1 ; k++) {
            int cost1 = mcm(arr,i,k);   //Ai...Ak
            int cost2 = mcm(arr,k+1,j); //Ak+1...Aj
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1+cost2+cost3;
            ans = Math.min(ans,finalCost);
        }
        return ans;
    }
}
