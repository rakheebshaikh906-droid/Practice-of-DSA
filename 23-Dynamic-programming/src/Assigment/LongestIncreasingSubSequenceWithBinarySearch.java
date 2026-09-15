package Assigment;

public class LongestIncreasingSubSequenceWithBinarySearch {
    static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(longestIncreasingSubsequence(arr));
    }
    public static int longestIncreasingSubsequence(int[] arr) {

        int n=arr.length;
        int[] temp = new int[n];

        temp[0] = arr[0];
        int len = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > temp[len - 1]) {
                temp[len] = arr[i];
                len++;
            }else {
                int ind = lowerBound(temp, len, arr[i]);
                temp[ind] = arr[i];
            }
        }
        return len;
    }

    // Java equivalent of C++ lower_bound()
    public static int lowerBound(int[] temp, int len, int target) {
        int left = 0;
        int right = len - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (temp[mid] >= target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
    }
}
