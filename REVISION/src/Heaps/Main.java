package Heaps;

//INSERT and DELETE HEAP USING ArrayList
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        int[] a = {50,30,40,10,5,20,30};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<a.length ; i++ ) {
            list.add(a[i]);
        }
        insertHeap(list,60);
        for (int i=0; i<list.size(); i++ ) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        deleteHeap(list);
        for (int i=0; i<list.size(); i++ ) {
            System.out.print(list.get(i)+" ");
        }
    }

    static void insertHeap(ArrayList<Integer> list, int val) {
        list.add(val);
        int i=list.size()-1;
        while(i>0) {
            int parent = i/2;
            if(list.get(parent)<val) {
                swap(list,i,parent);
                i = parent;
            } else {
                return;
            }
        }
    }

    static void deleteHeap(ArrayList<Integer> list){
        list.set(0,list.get(list.size()-1));
        list.remove(list.get(list.size()-1));
        int i =0;
        while(i<list.size()){
            int left = list.get(2*i);
            int right = list.get(2*i + 1);
            int largest;
            if(left<right){
                largest = 2*i + 1;
            }else{
                largest = 2*i;
            }
            if(list.get(i)<list.get(largest)){
                swap(list,i,largest);
                i=largest;
            }else{
                return;
            }
        }
    }
    static void swap(ArrayList<Integer> list, int i, int parent) {
        int temp = list.get(i);
        list.set(i, list.get(parent));
        list.set(parent, temp);
    }
}
