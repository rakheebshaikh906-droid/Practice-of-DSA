package Assigment;

//https://leetcode.com/problems/minimum-queen-moves-to-reach-target/description/
//4061. Minimum Queen Moves to Reach Target

public class MinimumQueenMovesToReachTarget {
    static void main(String[] args) {
        int[]source = {8,1}, target = {1,8};
        System.out.println(minQueenMoves(source,target));

    }
    static int minQueenMoves(int[] source, int[] target) {
        if (source[0] == target[0] && source[1] == target[1]) {
            return 0;
        }

        if (source[0] == target[0] ||
                source[1] == target[1] ||
                Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1])) {
            return 1;
        }

        return 2;
    }
}
