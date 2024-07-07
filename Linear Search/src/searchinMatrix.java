import java.util.Arrays;

public class searchinMatrix {
    public static void main(String[] args) {
        int[][] nums = {
                {32,12,44,56},
                {31,19,17},
                {11,5,-3}
        };
        System.out.println(Arrays.toString(search(nums,44)));  //for values of row and col mandatory
    }
    static int[] search(int[][]arr,int target){      //int[] one bracket only since putting ans in {row,col} this format
        if (arr.length==0){
            return new int[]{-1,-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                int element = arr[row][col];
                if (target == element){
                    return new int[]{row,col};    //NOTE DOWN***
                }
            }
        }
        return new int[]{-1,-1};
    }
}
