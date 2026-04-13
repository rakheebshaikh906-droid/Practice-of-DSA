package Assigment;

//https://leetcode.com/problems/combination-sum-ii/description/
//40. Combination Sum II
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    static void main(String[] args) {
        int[]candidates={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum2(candidates,target));
    }
    static List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        ArrayList<List<Integer>> result =new ArrayList<>();
        helper(candidates,0,0,target,new ArrayList<>(),result);
        return result;

    }
    static void helper(int[]candidates,int idx,int sum,int target,List<Integer>arr,List<List<Integer>>list){
        //base case
        if(sum>target){
            return;
        }
        if(sum==target){
            list.add(new ArrayList<>(arr));
            return;
        }
        for(int i=idx; i<candidates.length;i++){
            //for skip duplicates
            if(i>idx && candidates[i]==candidates[i-1]){
                continue;
            }
            arr.add(candidates[i]);
            //recursive call
            //index increase by one not i because i do not need duplicates
            helper(candidates,i+1,sum+candidates[i],target,arr,list);
            //remove last element
            //backtracking
            arr.remove(arr.size()-1);
        }
    }
}
