package Assigment;

//https://leetcode.com/problems/number-of-common-factors/description/
//2427. Number of Common Factors

public class NumberOfCommonFactors {
    static void main(String[] args) {
        int a=12;
        int b=6;
        System.out.println(commonFactor(a,b));
    }
    static int commonFactor(int a,int b){
        int count=0;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                count+=1;
            }
        }
        return count;
    }
}
