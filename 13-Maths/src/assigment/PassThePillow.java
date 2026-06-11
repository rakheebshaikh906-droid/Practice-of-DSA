package Assigment;

//https://leetcode.com/problems/pass-the-pillow/
//2582. Pass the Pillow

public class PassThePillow {
    static void main(String[] args) {
        int n=4;
        int time=5;
        System.out.println(passThePillow(n,time));
    }
    static int passThePillow(int n, int time) {
        int cycle = 2 * (n-1) ;
        int pos = time % cycle;

        if (pos < n) {
            return pos+1;
        } else {
            return 2 * n - pos - 1;
        }
    }
}
