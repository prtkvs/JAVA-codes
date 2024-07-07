//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class evenCount{
    public static void main(String[] args) {
        int[]nums = {12,345,2,6,7896};
        int value = even(nums);
        System.out.println(value);
    }
    static int even(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int ans =0;
        int i =0;
        while (i< arr.length){
            int count = check(arr[i]);
            if (count%2==0){
                ans+=1;
            }
            i++;
        }
        return ans;
    }
    static int check(int num){
        int count =0;
        while (num > 0) {
            int rem = 0;
            while (rem != 0) {
                rem = num % 10;
            }
            num /= 10;
            count++;
        }
        return count;
    }
}

