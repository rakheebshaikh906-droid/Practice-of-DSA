package Assigment;

//https://leetcode.com/problems/harshad-number/description/?envType=problem-list-v2&envId=math
//3099. Harshad Number

public class HarshadNumber {
    static void main(String[] args) {
        int x=18;
        System.out.println(sumOfTheDigitsOfHarshadNumber(x));
    }
    static int sumOfTheDigitsOfHarshadNumber(int x) {
        int digitSum=0;
        int temp=x;
        while(x>0){
            digitSum+=x%10;
            x/=10;
        }
        if(temp%digitSum==0){
            return digitSum;
        }
        return -1;
    }
}
