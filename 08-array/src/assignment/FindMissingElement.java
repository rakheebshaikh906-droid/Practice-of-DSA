package assignment;

//https://leetcode.com/problems/find-missing-elements/solutions/7493984/3731-find-missing-elements-by-rakheebsha-448a/
//3731. Find Missing Elements
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElement {
    static void main(String[] args) {
        int[]nums={1,4,2,5};
        System.out.println(findMissingElements(nums));
    }
    static List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1]){
                continue;
            }
            int current = nums[i];
            int next = nums[i + 1];

            // if gap is more than 1, numbers are missing
            while (current + 1 < next) {
                ans.add(current + 1);
                current++;
            }
        }
        return ans;
    }
}
