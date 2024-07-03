import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        //syntax
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(55);
        list.add(553);
        list.add(551);
        list.add(552);
        list.add(5544);
        list.add(53);
        System.out.println(list.contains(553));
        System.out.println(list.contains(24342));
        System.out.println(list);
        System.out.println("0 index changes");
        list.set(0,99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        //input
//        for(int i=0 ; i<5 ; i++){
//            list.add(in.nextInt());
//        }
//        //get item at any index
//        for(int i=0 ; i<5 ; i++){
//            System.out.println(list.get(i)); //pass index here list[index] syntax will not work here
//        }
    }
}
