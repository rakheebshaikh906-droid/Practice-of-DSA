package assignment;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
//1351. Count Negative Numbers in a Sorted Matrix

public class CountNegativeNumbersSortedMatrix {
    static void main(String[] args) {
        int[][]grid={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }
    static int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    count+=1;
                }
            }
        }
        return count;
    }
}
