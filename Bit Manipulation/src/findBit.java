public class findBit {
    public static void main(String[] args) {
        int number = 16;
        int i = 5; //1 since 16 = 0010000
        System.out.println(getbit(number , i));
    }
    static int getbit(int number , int i){
        return (number>>i-1)&1;
    }
}
