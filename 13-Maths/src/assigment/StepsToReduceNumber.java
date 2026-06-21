package Assigment;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
//1342. Number of Steps to Reduce a Number to Zero
public class StepsToReduceNumber {
    static void main(String[] args) {
        int num=14;
        System.out.println(numberOfSteps(num));
    }
    static int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0){
                num/=2;//if the current number is even, you have to divide it by 2
            }else{
                num--;//you have to subtract 1 from it.
            }
            count++;
        }
        return count;
    }
}
