package Assigment;

//https://leetcode.com/problems/find-the-child-who-has-the-ball-after-k-seconds/
//3178. Find the Child Who Has the Ball After K Seconds

public class FindTheChildWhoHasBallAfterKSeconds {
    static void main(String[] args) {
        int n=5;
        int k=6;
        System.out.println(numberOfChild(n,k));
    }
    static int numberOfChild(int n, int k) {
        int cycle = 2 * (n - 1);
        int pos = k % cycle;

        if (pos <= n - 1) {
            return pos;
        } else {
            return cycle - pos;
        }
    }
}
