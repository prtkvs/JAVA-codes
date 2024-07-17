package inArrays;

public class sorted {
    public static void main(String[] args) {
        int [] nums = {3,5,8,9,12};
        System.out.println(sorted(nums,0));
    }
    static boolean sorted(int[] arr , int index){
        //base condition
        if (index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index +1);
    }
}
