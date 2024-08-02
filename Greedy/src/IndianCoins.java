import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer [] coins ={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());  //use Integer to use this function
        ArrayList<Integer> ans = new ArrayList<>();

        int countCoins = 0;
        int amt = 590;

        for (int i = 0; i < coins.length; i++) {
            if (coins[i]<=amt){
                while (coins[i]<=amt){
                    countCoins++;
                    ans.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }
        System.out.println(countCoins);
        //to show the coins used for change (greedily)
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
