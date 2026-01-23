package code.rakheeb;

public class Binarysearch2D {
    static void main(String[] args) {
        int[][] matrix={
                {2,3,4},
                {5,6,7},
                {8,9,10}
        };
        int target=9;
        System.out.println(searchmatrix(matrix,target));
    }

    static boolean searchmatrix(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}
