package code;

import java.util.Arrays;

public class RadixSort {

    static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Count digits
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        System.out.println("Count array for " + exp + " : " + Arrays.toString(count));

        // Update count array
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        System.out.println("Updated count array " + Arrays.toString(count));

        // Build output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy back
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {29, 83, 471, 36, 91, 8};

        System.out.println("Origin array: " + Arrays.toString(arr));

        radixSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}