package Assigment;

//https://leetcode.com/problems/largest-odd-number-in-string/description/?envType=problem-list-v2&envId=math
//1903. Largest Odd Number in String
public class LargestOddNumber {
    static void main(String[] args) {
        String num="52";
        System.out.println(largestOddNumber(num));
    }
    static String largestOddNumber(String num){
        //check end to start
        for(int i=num.length()-1;i>=0;i--) {
            int digit = num.charAt(i) - '0';

            //check if digits odd or not
            if(digit%2==1){
                //return the longest prefix
                return num.substring(0,i+1);
            }
        }
        //no odd digits will found
        return "";
    }
}
