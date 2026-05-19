package Assigment;

//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
//1523. Count Odd Numbers in an Interval Range
public class CountOdd {
    static void main(String[] args) {
        int low=2;
        int high=8;
        System.out.println(OddCount(low,high));
    }
    static int OddCount(int low,int high){
        return (high+1)/2-low/2;
    }
}
