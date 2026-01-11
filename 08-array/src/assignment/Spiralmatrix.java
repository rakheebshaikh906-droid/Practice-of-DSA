package assignment;
// https://leetcode.com/problems/spiral-matrix/description/
//Leetcode problem spiral matrix(54).
import java.util.ArrayList;
import java.util.List;

public class Spiralmatrix {
    static void main(String[] args) {
        int[][] matrix = {
                { 1,  2,  3,  4},
                { 5,  6,  7,  8},
                { 9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        List<Integer>spiral=spiralOrder(matrix);
        System.out.println(spiral);

    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0) return result;

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // 1) Traverse Right (top row)
            for (int j = colBegin; j <= colEnd; j++) {
                result.add(matrix[rowBegin][j]);
            }
            rowBegin++; // move top boundary down

            // 2) Traverse Down (rightmost column)
            for (int i = rowBegin; i <= rowEnd && colBegin <= colEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--; // move right boundary left

            // 3) Traverse Left (bottom row) — only if still within remaining rows
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    result.add(matrix[rowEnd][j]);
                }
                rowEnd--; // move bottom boundary up
            }

            // 4) Traverse Up (leftmost column) — only if still within remaining cols
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(matrix[i][colBegin]);
                }
                colBegin++; // move left boundary right
            }
        }

        return result;
    }
}
