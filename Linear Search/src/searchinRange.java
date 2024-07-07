public class searchinRange {
    public static void main(String[] args) {
        int[] nums = {34, 5, 6, 7, 8, 9};
        System.out.println(search(nums,0,2,7)); //better //we can directly write in this waay
    }
    static boolean search(int[] arr, int index1,int index2,int target){
        if (arr.length==0){
            return false;
        }
        for (int i = index1; i <=index2 ; i++) {
            int element = arr[i];
            if (target==element){
                return true;
            }
        }
        return false;
    }
}
