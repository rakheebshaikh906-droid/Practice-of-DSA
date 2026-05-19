package Assigment;

//https://leetcode.com/problems/count-operations-to-obtain-zero/description/?envType=problem-list-v2&envId=math
//2169. Count Operations to Obtain Zero

public class CountOperationsToObtainZero {
    static void main(String[] args) {
        int num1=2;
        int num2=3;
        System.out.println(countOperation(num1,num2));
    }
    static int countOperation(int num1,int num2){
        int count=0;

        while(num1!=0 && num2!=0){
            if(num1>=num2){
                num1=num1-num2;
            }else{
                num2=num2-num1;
            }
            count+=1;
        }
        return count;
    }
}
