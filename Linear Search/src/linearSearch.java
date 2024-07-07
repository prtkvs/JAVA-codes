public class linearSearch {
    public static void main(String[] args) {
       int[] nums = {32,12,44,56,-12,16,86,23,54};
       int target = 23;
        System.out.println(search(nums,target));
    }
    static int search(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (target==element){
                return index;
            }
        }
        return -1;
    }
}
