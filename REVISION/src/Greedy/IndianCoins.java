package Greedy;
import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
            System.out.println("-------INDIAN COINS------");

            Integer[] coins = {1,2,5,10,20,50,100,200,500};
            int V = 500;
            Arrays.sort(coins, Collections.reverseOrder());
            ArrayList<Integer> list = new ArrayList<>();
            int noOfCoins = 0;
            for (int i=0; i<coins.length ; i++ ) {
                if (coins[i]<=V) {
                    while(coins[i]<=V) {
                        list.add(coins[i]);
                        noOfCoins++;
                        V -= coins[i];
                    }
                } else if(V==0) break;
            }
            System.out.println("no. of Coins used : "+noOfCoins);
            for (int i=0;i<list.size();i++ ){
                System.out.print(list.get(i)+" ");
            }
        }
    }
