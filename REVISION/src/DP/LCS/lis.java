package DP.LCS;
import java.util.*;
public class lis {
    public static void main(String[] args) {
            System.out.println("Longest Increasing Substring");
            int[] arr = {50,3,10,7,40,80};
            System.out.println(lis(arr));
        }

        static int lis(int [] arr) {
            HashSet<Integer> set = new HashSet<>(); // get unique elements
            for(int i=0; i<arr.length; i++) {
                set.add(arr[i]);
            }
            int[] arr2 = new int[set.size()];
            int i=0;
            for(int nums : set) {
                arr2[i] = nums;
                i++;
            }
            Arrays.sort(arr2);
            return lcsTab(arr,arr2);
        }

        static int lcsTab(int[] a1, int[] a2) {
            int n = a1.length;
            int m = a2.length;
            int[][] dp = new int[n+1][m+1];

            for(int i=1; i<n+1; i++) {
                for (int j=1; j<m+1 ; j++ ) {
                    if(a1[i-1]==a2[j-1]) {
                        dp[i][j] = dp[i-1][j-1]+1;
                    } else {
                        int ans1 = dp[i-1][j];
                        int ans2 = dp[i][j-1];
                        dp[i][j] = Math.max(ans1,ans2);
                    }
                }
            }
            return dp[n][m];
        }
    }
