public class numOrder {
    public static void main(String[] args) {
       // numAsc(5);
        numDsc(5);
    }
    static void numAsc(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        numAsc(n-1);
    }
    static void numDsc(int n){
        if (n==0){
            return;
        }
        numDsc(n-1);
        System.out.println(n);  //V.easy think (ya debug kr ke check kr lo)
    }

}
