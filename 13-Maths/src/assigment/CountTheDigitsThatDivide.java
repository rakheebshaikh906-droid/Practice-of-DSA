package Assigment;

//https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/
//2520. Count the Digits That Divide a Number
public class CountTheDigitsThatDivide {
    static void main(String[] args) {
        int num=121;
        System.out.println(countDigits(num));
    }
    static int countDigits(int num){
        int n=num;
        int count=0;

        while(num>0){
            int digit=num%10;

            if(digit!=0 && n%digit==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}
