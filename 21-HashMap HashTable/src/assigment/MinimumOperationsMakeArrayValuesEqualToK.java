package assigment;

//https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/description/?envType=problem-list-v2&envId=hash-table
//3375. Minimum Operations to Make Array Values Equal to K

import java.util.HashSet;
import java.util.Set;

public class MinimumOperationsMakeArrayValuesEqualToK {
    static void main(String[] args) {
        int[]nums={5,2,5,4,5};
        int k=2;
        System.out.println(minOperation(nums,k));
    }
    static int minOperation(int[]nums,int k){
        Set<Integer> set=new HashSet<>();
        for(int num : nums){
            if(num<k) return -1;
            if(num>k) set.add(num);
        }
        return set.size();
    }
}
