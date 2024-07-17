package introduction;

public class BinarySearch {
    public static void main(String[] args) {
    int[] arr= {1,2,3,4,55,66,78};
    int target = 55;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[]arr,int target ,int s, int e){
        if(s>e){
            return -1;//will return -1 only,but it indicates that the element has not been found(C/C++/JAVA convention)
        }
        int m = s + (e-s) / 2;  //we didn't use mid = (s+e)/2 to avoid potential overflow of data types mostly for int
                             //for large numbers which int barely manages ,cannot respond for large numbers here->(s+e)
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        return search(arr , target, m+1 , e);
    }
}
