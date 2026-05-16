package Assigment;

//https://leetcode.com/problems/closest-divisors/description/?envType=problem-list-v2&envId=math
//1362. Closest Divisors

import java.util.Arrays;
public class ClosestDivisors {
    static void main(String[] args) {
        int num=123;
        System.out.println(Arrays.toString(closet(num)));
    }
    static int[] closet(int num){
        int n=num+1;
        int m=num+2;

        int[]ans1=new int[2];
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                ans1[0]=i;
                ans1[1]=n/i;
            }
        }
        int[]ans2=new int[2];
        for(int j=1;j<=Math.sqrt(m);j++){
            if(m%j==0){
                ans2[0]=j;
                ans2[1]=m/j;
            }
        }
        int result1=Math.abs(ans1[0]-ans1[1]);
        int result2=Math.abs(ans2[0]-ans2[1]);

        if(result1<result2){
            return ans1;
        }
        return ans2;
    }
}
