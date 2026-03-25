package assignment;

//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/?envType=problem-list-v2&envId=array
//1304. Find N Unique Integers Sum up to Zero

import java.util.Arrays;
public class FindNUniqueIntegersSumupToZero {
    static void main(String[] args) {
        int n=5;
        System.out.println(Arrays.toString(find(n)));
    }
    static int[] find(int n){
        int[]ans=new int[n];
        int index=0;
        int i=1;
        while(index<n){
            if(index<n-1){
                ans[index++]=i;
                ans[index++]=-i;
                i++;
            }else{
                ans[index++]=0;
            }
        }
        return ans;
    }
}
