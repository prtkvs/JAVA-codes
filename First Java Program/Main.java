public class Main {
    public static int main(String[] args) {
        int n =19;
        int sum =0;
        int m=1;
        while(n>0){
            sum+=n%10;
            m*=n%10;
            n/=10;
            n++;
        }
        return m-sum;
    }
}
