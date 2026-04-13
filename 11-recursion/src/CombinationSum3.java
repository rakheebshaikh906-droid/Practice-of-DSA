package Assigment;

//https://leetcode.com/problems/combination-sum-iii/description/
//216. Combination Sum III
import java.util.List;
import java.util.ArrayList;

public class CombinationSum3 {
    static void main(String[] args) {
        int k=3;
        int n=7;//target
        System.out.println(combinationSum3(k,n));
    }
    static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(1, k, n, new ArrayList<>(), result);
        return result;
    }

    static void helper(int start, int k, int n,List<Integer>arr, List<List<Integer>>list) {

        // base case
        if (arr.size() == k) {
            if (n == 0) {
                list.add(new ArrayList<>(arr));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > n) break; // pruning

            arr.add(i);
            helper(i + 1, k, n - i,arr,list);
            arr.remove(arr.size() - 1); // backtrack
        }
    }
}
