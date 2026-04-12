package Assigment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum/description/
//39. Combination Sum
public class CombinationSum {
    static void main(String[] args) {
        int []candidates={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidates,target));

    }
    static List<List<Integer>> combinationSum(int[] candidates, int target){
        ArrayList<List<Integer>> result =new ArrayList<>();
        helper(candidates,0,0,target,new ArrayList<>(),result);
        return result;

    }
    static void helper(int[]candidates,int idx,int sum,int target,List<Integer>arr,List<List<Integer>>list){
        Arrays.sort(candidates);
        //base case
        if(sum>target){
            return;
        }
        if(sum==target){
            list.add(new ArrayList<>(arr));
            return;
        }
        for(int i=idx; i<candidates.length;i++){
            arr.add(candidates[i]);
            //recursive call
            helper(candidates,i,sum+candidates[i],target,arr,list);
            //remove last element
            //backtracking
            arr.remove(arr.size()-1);
        }
    }
}
