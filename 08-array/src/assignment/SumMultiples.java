package assignment;

//https://leetcode.com/problems/sum-multiples/description/
//2652. Sum Multiples
public class SumMultiples {
    static void main(String[] args) {
        int n=10;
        System.out.println(sumOfMultiples(n));
    }
    static int sumOfMultiples(int n) {
        int sum=0;
        for(int i=0;i<=n;i++)
            if (i % 3==0 || i % 5==0 || i % 7==0) {
                sum += i;
            }
        return sum;
    }
}
