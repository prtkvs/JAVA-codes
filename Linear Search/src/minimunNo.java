public class minimunNo {
    public static void main(String[] args) {
        int[][] nums = {
                {32,12,44,56},
                {31,19,17},
                {11,5,2}
        };
        System.out.println(min(nums));
    }
    static int min(int[][] arr){
        //assume arr.length != 0
        int ans = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {    //columns always depends on row
                if (arr[i][j] < ans) {
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }
}
