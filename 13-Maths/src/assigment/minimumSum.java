package Assigment;

//https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/?envType=problem-list-v2&envId=math
//2160. Minimum Sum of Four Digit Number After Splitting Digits
import java.util.ArrayList;
import java.util.Collections;

public class minimumSum {
    static void main(String[] args) {
        int num=2932;
        System.out.println(minimum(num));
    }
    static int minimum(int num){
        ArrayList<Integer>list=new ArrayList<>();
        while(num!=0){
             int digit=num%10;
             list.add(digit);
            num/=10;
        }
        Collections.sort(list);
        int num1 = list.get(0) * 10 + list.get(2);
        int num2 = list.get(1) * 10 + list.get(3);

        return num1+num2;

    }
}
