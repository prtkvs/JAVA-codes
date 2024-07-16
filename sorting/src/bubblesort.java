import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
       int[] nums = {-13,-34,-4,23,9,0,3};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubble(int[] arr){
        boolean swapped;  //made to check if array is sorted then dont check next pass
        //run the steps n-1 times
        for (int i = 0; i <arr.length ; i++) {
            swapped = false;
            //for each step , max item will come at last respective index
            for (int j = 1; j < arr.length-i ; j++) {
                //swap if the item is smaller than the previous one
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
