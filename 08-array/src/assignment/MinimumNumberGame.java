package assignment;

//https://leetcode.com/problems/minimum-number-game/description/?envType=problem-list-v2&envId=array
//2974. Minimum Number Game

import java.util.Arrays;

public class MinimumNumberGame {
    static void main(String[] args) {
        int[]nums={5,4,2,3};
        System.out.println(Arrays.toString(numberGame(nums)));
    }
    static int[] numberGame(int[]nums){
        int[]ans=new int[nums.length];
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<n-1;i+=2){
            swap(ans,i,i+1);
        }
        return ans;
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
