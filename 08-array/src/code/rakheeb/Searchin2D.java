package code.rakheeb;
//https://leetcode.com/problems/search-a-2d-matrix/
//leetcode problem(74)Q.search in 2D array.
public class Searchin2D {
    static void main(String[] args) {
        int[][] matrix={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target=3;
        System.out.println(search(matrix,target));
    }

    static boolean search(int[][] matrix,int target){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
