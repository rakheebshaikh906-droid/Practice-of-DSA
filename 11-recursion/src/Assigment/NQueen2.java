package Assigment;

//https://leetcode.com/problems/n-queens-ii/description/
//52. N-Queens II
public class NQueen2 {
    static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }
    static int totalNQueens(int n) {
        boolean[][]board=new boolean[n][n];
        return queens(board,0);
    }
    static int queens(boolean[][]board,int row){
        if(row==board.length){
            return 1;
        }
        int count=0;
        //placing the queen and checking for every row and col
        for(int col=0;col< board.length;col++){
            //place the queen if its safe
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][]board,int row,int col){
        //check vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        // left diagonal
        for (int i = 1; row - i >= 0 && col - i >= 0; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // right diagonal
        for (int i = 1; row - i >= 0 && col + i < board.length; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }
}
