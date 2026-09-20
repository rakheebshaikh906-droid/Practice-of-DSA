package assignment;

//https://leetcode.com/problems/minimum-absolute-difference/description/
//1200. Minimum Absolute Difference

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    static void main(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(minimumAbsDifference(arr));

    }
    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            diff = Math.min(diff, arr[i] - arr[i - 1]);
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])==diff){
                ans.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return ans;

    }
}
