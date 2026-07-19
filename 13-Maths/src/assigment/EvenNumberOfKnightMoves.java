package Assigment;

//https://leetcode.com/contest/weekly-contest-511/problems/even-number-of-knight-moves/
//Q1. Even Number of Knight Moves

public class EvenNumberOfKnightMoves {
    static void main(String[] args) {
        int[]start={1,1};
        int[]target={2,2};

        System.out.println(canReach(start,target));
    }
    static boolean canReach(int[] start, int[] target) {
        if((start[0]+start[1])%2==(target[0]+target[1])%2){
            return true;
        }
        return false;
    }
}
