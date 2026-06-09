package Assigment;

//https://leetcode.com/problems/nim-game/
//292. Nim Game
public class NimGame {
    static void main(String[] args) {
        int n=4;
        System.out.println(isWin(n));
    }
    static boolean isWin(int n){
        return n%4!=0;
    }
}
