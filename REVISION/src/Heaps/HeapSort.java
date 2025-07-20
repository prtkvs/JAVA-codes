package Heaps;

public class HeapSort {

        public static void main(String[] args) {
            int[] a = {20,10,30,5,50,40};
            int n = a.length;
            buildHeap(a,n);
            heapSort(a,n);
            for (int i=0; i<n ; i++ ) {
                System.out.print(a[i]+" ");
            }
        }

        public static void buildHeap(int[] a, int n) {
            for (int i=(n/2) - 1; i>=0 ; i-- ) {
                heapify(a,n,i);
            }
        }

        public static void heapify(int[] a, int n, int i) {
            int largest = i;
            int left = 2*i;
            int right = 2*i+ 1;
            if(left<n && a[left]>a[largest]) {
                largest = 2*i;
            }
            if(right<n && a[right]>a[largest]) {
                largest = (2*i)+ 1;
            }
            if(largest!=i) {
                swap(a,i,largest);
                heapify(a,n,largest);
            } // else part is done by buildHeap function
        }

        public static void swap(int[] a, int i, int largest) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
        }

        public static void heapSort(int[]a,int n) {
            for (int i = n - 1; i >= 0; i--) {
                swap(a, 0, i);
                heapify(a, i, 0);
            }
        }
    }
