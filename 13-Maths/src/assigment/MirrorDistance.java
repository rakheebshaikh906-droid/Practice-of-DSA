package Assigment;

//https://leetcode.com/problems/mirror-distance-of-an-integer/description/?envType=problem-list-v2&envId=math
//3783. Mirror Distance of an Integer
public class MirrorDistance {
    static void main(String[] args) {
        int n=25;
        System.out.println(mirrorDistance(n));
    }
    static int mirrorDistance(int n){
        return Math.abs(n-reverse(n));
    }

    static int reverse(int n){
        //used long for safety for overflow
        long ans = 0;
        int num=Math.abs(n);
        while (num>0){
            int rem = num%10;
            ans = (ans*10) + rem;
            num /= 10;
        }
        if(ans>Integer.MAX_VALUE){
            return 0;
        }
        return (int) ans;
    }
}
