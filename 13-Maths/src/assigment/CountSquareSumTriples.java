package Assigment;

//https://leetcode.com/problems/count-square-sum-triples/description/?envType=problem-list-v2&envId=math
//1925. Count Square Sum Triples

public class CountSquareSumTriples {
    static void main(String[] args) {
        int n=10;
        System.out.println(countTriplet(n));
    }
    static int countTriplet(int n){
        int count=0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int c2 = a*a + b*b;
                int c = (int)Math.sqrt(c2);

                if (c <= n && c*c == c2) {
                    count++;
                }
            }
        }
        return count;
    }
}
