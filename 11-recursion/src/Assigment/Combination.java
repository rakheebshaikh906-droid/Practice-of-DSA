package Assigment;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combinations/description/
//77. Combinations
//Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
public class Combination {
    static void main(String[] args) {
        int n=4;
        int k=2;
        System.out.println(combination(k,n));
    }
    static List<List<Integer>> combination(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(1,n,k, new ArrayList<>(), result);
        return result;
    }

    static void helper(int start, int n, int k,List<Integer>arr, List<List<Integer>>list) {

        // base case
        if (arr.size() == k) {
            list.add(new ArrayList<>(arr));
            return;
        }

        for (int i = start; i <= n; i++) {
            arr.add(i);
            helper(i + 1,n,k,arr,list);
            arr.remove(arr.size() - 1); // backtrack
        }
    }
}
