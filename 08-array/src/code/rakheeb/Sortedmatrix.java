package code.rakheeb;

import java.util.Arrays;

public class Sortedmatrix {
    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 11;

        System.out.println(Arrays.toString(search(matrix,target)));
    }

    // Search in sorted matrix
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Edge case: if matrix has only one row
        if (rows == 1) {
            return simpleBinarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have only 2 rows
        // Check whether the target is in the middle column of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in 4 parts (quadrants)
        // 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return simpleBinarySearch(matrix, rStart, 0, cMid - 1, target);
        }

        // 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return simpleBinarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        // 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return simpleBinarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            // 4th half
            return simpleBinarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    // Simple binary search in a given row
    static int[] simpleBinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }

            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1, -1};

    }
}
