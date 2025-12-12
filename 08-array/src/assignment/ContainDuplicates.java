package assignment;

//https://leetcode.com/problems/contains-duplicate/description/
//217. Contains Duplicate
import java.util.Arrays;
public class ContainDuplicates {
    static void main(String[] args) {
        int[]nums={1,4,3,1};
        System.out.println(Contain(nums));
    }
    static boolean Contain(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
