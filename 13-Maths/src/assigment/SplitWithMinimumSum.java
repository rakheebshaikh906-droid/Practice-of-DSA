package Assigment;

//https://leetcode.com/problems/split-with-minimum-sum/submissions/1903020555/?envType=problem-list-v2&envId=math
//2578. Split With Minimum Sum

import java.util.Arrays;
public class SplitWithMinimumSum {
    static void main(String[] args) {
        int num=4325;
        System.out.println(split(num));
    }
    static int split (int num){
        String s=Integer.toString(num);
        int[]arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-'0';
        }
        Arrays.sort(arr);
        int num1=0;
        int num2=0;
        for(int i=0;i< arr.length;i++){
            if(i%2==0){
                num1=num1*10+arr[i];
            }else{
                num2=num2*10+arr[i];
            }

        }
        return num1+num2;

    }
}
