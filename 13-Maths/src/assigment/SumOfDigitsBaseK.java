package Assigment;

//https://leetcode.com/problems/sum-of-digits-in-base-k/description/?envType=problem-list-v2&envId=math
//1837. Sum of Digits in Base K

public class SumOfDigitsBaseK {
    static void main(String[] args) {
        int n=34;
        int k=6;
        System.out.println(convert(n,k));
    }
    static int convert(int n,int k){
        int sum=0;
        while(n>0){
            sum+=n%k;
            n/=k;
        }
        return sum;
    }
}
