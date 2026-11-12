
package Assigment;

import java.util.Arrays;

// https://leetcode.com/problems/the-k-strongest-values-in-an-array/
// 1471. The k Strongest Values in an Array

public class KStrongestValuesInAnArray {

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int[] ans = getStrongest(arr, k);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] getStrongest(int[] arr, int k) {
        int[] ans = new int[k];
        int index = 0;

        Arrays.sort(arr);

        int left = 0;
        int n = arr.length;
        int right = n - 1;

        int mid = arr[(n - 1) / 2];

        while (index < k) {
            int leftStrength = Math.abs(arr[left] - mid);
            int rightStrength = Math.abs(arr[right] - mid);

            if (rightStrength > leftStrength) {
                ans[index++] = arr[right--];
            } else if (rightStrength < leftStrength) {
                ans[index++] = arr[left++];
            } else {
                if (arr[right] > arr[left]) {
                    ans[index++] = arr[right--];
                } else {
                    ans[index++] = arr[left++];
                }
            }
        }

        return ans;
    }
}
