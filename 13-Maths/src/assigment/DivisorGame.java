package Assigment;

//https://leetcode.com/problems/divisor-game/description/
//1025. Divisor Game

public class DivisorGame {
    static void main(String[] args) {
        int n=2;
        System.out.println(divisorGame(n));
    }
    static boolean divisorGame(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
}
