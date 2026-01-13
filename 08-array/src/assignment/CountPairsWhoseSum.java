package assignment;

//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
//2824. Count Pairs Whose Sum is Less than Target

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSum {
    static void main(String[] args) {

//        List<Integer>nums=new ArrayList<>();
//        nums.add(-1);
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);
//        nums.add(1);

        List<Integer> nums = Arrays.asList(-1, 1, 2, 3, 1);
        int target=2;

        CountPairsWhoseSum obj = new CountPairsWhoseSum();
        int result = obj.countPairs(nums, target);

        System.out.println(result); // Output: 3

    }
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if((nums.get(i)+ nums.get(j))<target){
                    count+=1;
                }
            }
        }
        return count;
    }
}
