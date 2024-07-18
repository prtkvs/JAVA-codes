package level1;

public class reverse {
    public static void main(String[] args) {
        reverse1(12378654);
        System.out.println(sum);
        System.out.println(rev2(123));
    }
    static int sum =0;
    static void reverse1(int n){
        if (n==0){
            return ;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse1(n/10);
    }
    static int  rev2(int n){
        int digits = (int)(Math.log10(n))+1;  //number of digits in base 10 //for base 'b' = int(logn/logb)+1 //and we use int bcoz the value of int(logn/logb)+1 is 'double' so we casted into int //and +1 since int us decimal ko floor (GIF) kr dega so +1 final ans.
        return helper(n,digits);
    }
    private static int helper(int n ,int digits){
        if (n%10==n){
            return n;
        }
        int rem = n%10;
        return rem* (int)Math.pow(10,digits-1)+ helper(n/10,digits-1);
    }

}
