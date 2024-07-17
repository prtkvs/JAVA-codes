package inArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int [] nums = {5,2,6,1,89,89,7};
        System.out.println(find(nums,89,0));
        System.out.println(findIndex(nums,89,0));
        System.out.println(findIndexLast(nums,89,nums.length-1));   //5, since starting from last index
        findAllIndex(nums,89,0);
        System.out.println(list);
//        System.out.println(findAllIndex2(nums,89,0,list)); or,
        ArrayList<Integer> ans = findAllIndex2(nums,89,0,list);
        System.out.println(ans);
    }


    static boolean find(int[]arr, int target , int index){
        if (index == arr.length){
            return false;           //element does not exist
        }
        return (arr[index]==target) || find(arr,target,index+1);
    }

    static int findIndex (int[]arr, int target , int index){
        if (index == arr.length) {
            return -1;
        } else if (arr[index]==target) {
            return index;
        }
            return findIndex(arr,target,index+1);
    }
    static int findIndexLast (int[]arr, int target , int index){
        if (index == -1) {
            return -1;
        } else if (arr[index]==target) {
            return index;
        }
        return findIndexLast(arr,target,index-1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex (int[]arr, int target , int index){
        if (index == arr.length) {
            return ;
        } else if (arr[index]==target) {
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
    static ArrayList<Integer> findAllIndex2(int [] arr,int target , int index , ArrayList<Integer>list){    //return type is ArrayList
        if (index == arr.length){
            return list;
        }
        return findAllIndex2(arr,target,index+1,list);
    }
}
