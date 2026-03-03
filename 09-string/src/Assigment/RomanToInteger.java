package Assigment;
//https://leetcode.com/problems/roman-to-integer/description/
//13. Roman to Integer

public class RomanToInteger {
    static void main(String[] args) {
        String s="LVIII";
        char[] ch=s.toCharArray();
        System.out.println(romanToInt(s));
    }
    static int getvalue(char ch){
        switch (ch){
            case'I':return 1;
            case'V':return 5;
            case'X':return 10;
            case'L':return 50;
            case'C':return 100;
            case'D':return 500;
            case'M':return 1000;
            default:return 0;
        }
    }
    static int romanToInt(String s){
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            if((i+1)<n && getvalue(ch1)<getvalue(s.charAt(i+1))){
                sum-=getvalue(ch1);
            }else{
                sum+=getvalue(ch1);
            }
        }
        return sum;
    }
}
