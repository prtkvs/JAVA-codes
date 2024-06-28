public class isUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,4,6,2};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique =0;
        for(int n : arr){   //for every number in my array
            unique ^= n ; //symbol of XOR is ^=
        }
        return unique;
    }
}
