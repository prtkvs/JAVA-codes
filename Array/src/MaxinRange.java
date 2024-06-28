public class MaxinRange {
    public static void main(String[] args) {
        int[] arr ={11,22,33,44,55};
        System.out.println(maxinrange(arr,1,3));
    }
    static int maxinrange(int[] arr,int start, int end){
        int maxval= arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
