public class RangeXorinCodeforces {
    public static void main(String[] args) {
    int n = 8;
        System.out.println(xor(n));
        //range xor for between a and b = xor(b) ^ xor(a-1)
        int a =3;
        int b = 9;

        int ans = xor(b) ^ xor(a-1) ;
        System.out.println(ans);

        //only for check , will give time limit exceeds for large number
        int ans2=0;
        for (int i = a; i <=b ; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }

    //this gives xor from 0 to a;
    //based on observations ,take examples and check yourself
    static int xor(int a){
        if(a % 4==0){
            return a;
        }
        if(a % 4==1){
            return 1;
        }
        if(a % 4==2){
            return a+1;
        }
        if(a % 4==3){
            return 0;
        }
        return 0;
    }
}