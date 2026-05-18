package Assigment;

//https://leetcode.com/problems/count-integers-with-even-digit-sum/submissions/1894075619/?envType=problem-list-v2&envId=math
//2180. Count Integers With Even Digit Sum

public class CountIntegersWithEvenDigitSum {
    static void main(String[] args) {
        int num=30;
        System.out.println(countEven(num));
    }
    static int countEven(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            int temp=i;
            int digitsum=0;
            while(temp>0){
                digitsum+=temp%10;
                temp/=10;
            }
            if(digitsum%2==0){
                sum+=1;
            }
        }
        return sum;
    }
}
