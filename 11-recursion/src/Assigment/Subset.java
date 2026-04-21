package Assigment;

//https://leetcode.com/problems/subsets/
//78. Subsets
import java.util.ArrayList;
import java.util.List;
public class Subset {
    static void main(String[] args) {
        int[]nums={1,2,3};
        System.out.println(subset(nums));
    }
    static List<List<Integer>>subset(int[]nums){
        //create a new outer list
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : nums){
            //size
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer>Internal=new ArrayList<>(outer.get(i));

                Internal.add(num);
                outer.add(Internal);
            }
        }
        return outer;
    }
    //recursion version
    static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        // Add the current subset
        ans.add(new ArrayList<>(current));

        // Recursive calls
        for (int i = index; i < nums.length; i++) {
            // include nums[i]
            current.add(nums[i]);

            // move to next index
            generateSubsets(i + 1, nums, current, ans);

            // backtrack (remove last added element)
            current.remove(current.size() - 1);
        }
    }
}
