package Assigment;

//https://leetcode.com/problems/determine-color-of-a-chessboard-square/description/
//1812. Determine Color of a Chessboard Square
public class chessBoardSquare {
    static void main(String[] args) {
        String coordinates="a1";

        System.out.println(squareIsWhite(coordinates));
    }
    static boolean squareIsWhite(String coordinates){
        return ((coordinates.charAt(0)-'a') + (coordinates.charAt(1)-'1')) % 2 == 1;
    }
}
