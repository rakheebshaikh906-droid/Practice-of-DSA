package Assigment;

//https://leetcode.com/problems/base-7/description/?envType=problem-list-v2&envId=math
//504. Base 7
public class Base7 {
    static void main(String[] args) {
        int num=100;
        System.out.println(convertToBase7(num));
    }
    static String convertToBase7(int num){
        if(num==0){
            return "0";
        }
        // handle negative numbers
        boolean negative = false;
        if (num < 0) {
            negative = true;
            num = Math.abs(num);//convert negative number into positive number
        }

        StringBuilder sb = new StringBuilder();

        // convert to base 7
        while (num > 0) {
            int rem = num % 7;
            sb.append(rem);
            num = num / 7;
        }

        // add negative sign if needed
        if (negative) {
            sb.append("-");
        }

        // reverse to get correct order
        return sb.reverse().toString();
    }
}
