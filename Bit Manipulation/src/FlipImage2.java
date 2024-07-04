public class FlipImage2 {
    class Solution {
        public int[][] flipAndInvertImage(int[][] image) {
            for(int i=0; i<image.length;i++)
                reverse(image[i]);

            for(int i=0; i<image.length;i++)
            {
                for(int j=0;j<image[i].length;j++)
                    image[i][j] = image[i][j] ^ 1; //gives complement a ^ 1 = complement
            }
            return image;
        }


        void reverse(int[] arr) {
            int start = 0;
            int end = arr.length-1;

            while (start < end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        void swap(int[] arr, int index1, int index2) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }
}
