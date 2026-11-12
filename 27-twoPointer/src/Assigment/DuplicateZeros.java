
package Assigment;

// https://leetcode.com/problems/duplicate-zeros/
// 1089. Duplicate Zeros

public class DuplicateZeros {

    static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        duplicateZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void duplicateZeros(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] == 0 && i + 1 < length) {

                for (int j = length - 1; j > i + 1; j--) {
                    arr[j] = arr[j - 1];
                }

                arr[i + 1] = 0;
                i++;
            }
        }
    }
}
