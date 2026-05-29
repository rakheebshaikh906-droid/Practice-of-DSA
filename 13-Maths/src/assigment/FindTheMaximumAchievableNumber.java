package Assigment;

//https://leetcode.com/problems/find-the-maximum-achievable-number/
//2769. Find the Maximum Achievable Number

public class FindTheMaximumAchievableNumber {
    static void main(String[] args) {
        int num=4;
        int t=1;
        System.out.println(theMaximumAchievableX(num,t));
    }
    static int theMaximumAchievableX(int num, int t) {
        return num+t*2;
    }
}
