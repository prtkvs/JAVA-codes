public class Max {
    public static void main(String[] args) {
        int[] arr = {22, 33, 44, 55, 66};
        System.out.println(max(arr));
    }
    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 0; i < 5; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
