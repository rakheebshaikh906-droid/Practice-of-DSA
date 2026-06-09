package Assigment;

//https://leetcode.com/problems/a-number-after-a-double-reversal/description/?envType=problem-list-v2&envId=math
//2119. A Number After a Double Reversal

public class NumberAfterDoubleReverse {
    static void main(String[] args) {
        int num=526;
        System.out.println(isSameAfterReversals(num));
        System.out.println(isSameAfterReverse2(num));
    }
    static boolean isSameAfterReversals(int num) {
        int original=num;
        int reverse1=0;
        int reverse2=0;

        while(num!=0){
            int digit=num%10;
            reverse1=reverse1*10+digit;
            num/=10;
        }
        while(reverse1!=0){
            int digit=reverse1%10;
            reverse2=reverse2*10+digit;
            reverse1/=10;
        }

        return reverse2==original;
    }

    //2nd optimize solution
    static boolean isSameAfterReverse2(int num){
        if(num==0){
            return true;
        }
        return num%10!=0;
    }
}
