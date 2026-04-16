package Assigment;

import java.util.List;
import java.util.ArrayList;

//https://leetcode.com/problems/permutations/description/
//46. Permutations
public class Permutation {
    static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        List<List<Integer>> result = permuteList(new ArrayList<>(), nums);
        System.out.println(result);
    }
    static List<List<Integer>> permuteList(List<Integer> p, List<Integer> up) {
        //base case
        if (up.isEmpty()) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(p));
            return list;
        }
        int ch = up.get(0);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= p.size(); i++) {
            List<Integer> first = new ArrayList<>(p.subList(0, i));
            List<Integer> second = new ArrayList<>(p.subList(i, p.size()));

            //we create a new list for adding f+ch+s because in integer we did not direct add like '+' because of this we create a new list
            List<Integer> newList = new ArrayList<>();
            newList.addAll(first);
            newList.add(ch);
            newList.addAll(second);

            ans.addAll(permuteList(newList, up.subList(1, up.size())));
        }
        return ans;
    }
}
