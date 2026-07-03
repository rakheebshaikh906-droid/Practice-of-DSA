package Assigment;

//https://leetcode.com/problems/water-and-jug-problem/description/
//365. Water and Jug Problem
public class Water_Jug {
    static void main(String[] args){
        int x=3;
        int y=5;
        int target=4;
        System.out.println(canMeasurewater(x,y,target));
    }
    static boolean canMeasurewater(int x,int y,int target){
        if (target > x + y) return false;
        if (target == 0) return true;
        return target % gcd(x,y) == 0;
    }

    static int gcd(int a, int b) {
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
