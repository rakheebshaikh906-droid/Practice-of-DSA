package Assigment;

//https://leetcode.com/problems/sum-of-square-numbers/description/?envType=problem-list-v2&envId=two-pointers
//633. Sum of Square Numbers
public class SumOfSquareNumber {
    static void main(String[] args){
        int c=5;
        System.out.println(judgeSquareSum(c));
    }
    static boolean judgeSquareSum(int c){
        int a=0;
        int b=(int) Math.sqrt(c);

        while(a<=b) {
            long sum = (long)(a * a) + (long)(b * b);

            if (sum == c) {
                return true;
            }
            if (sum < c) {
                a++;
            } else {
                b--;
            }
        }
        return false;
    }
}
