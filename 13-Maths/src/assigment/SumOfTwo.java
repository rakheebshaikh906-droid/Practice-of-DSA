package Assigment;

//https://leetcode.com/problems/sum-of-two-integers/description/?envType=problem-list-v2&envId=math
//371. Sum of Two Integers
//Given two integers a and b, return the sum of the two integers without using the operators + and -.
public class SumOfTwo {
    static void main(String[] args) {
        int a=1;
        int b=2;
    }
    static int getSum(int a,int b){
        while(b!=0){
            int carry=(a&b)<<1;//carry calculate
            a=a^b;//sum without carry
            b=carry;//carry ko b bana do
        }
        return a;
    }
}
