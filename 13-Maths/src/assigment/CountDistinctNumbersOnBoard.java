package Assigment;

//https://leetcode.com/problems/count-distinct-numbers-on-board/description/
//2549. Count Distinct Numbers on Board

public class CountDistinctNumbersOnBoard {
    static void main(String[] args) {
        int n=5;
        System.out.println(countDist(n));
    }
    static int countDist(int n){
        if(n==1){
            return 1;
        }
        return n-1;
    }
}
