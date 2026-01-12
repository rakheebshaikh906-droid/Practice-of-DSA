package assignment;
//https://leetcode.com/problems/3sum/
//leetcode question(15)3sum
import java.util.*;
public class Sum3 {
    static void main(String[] args) {
        int[]nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    static List<List<Integer>> threeSum(int[] nums){
        if(nums==null || nums.length<3){
            return new ArrayList<>();//return empty list
        }

        //sort the element
        Arrays.sort(nums);
        Set<List<Integer>>result= new HashSet<>();
        // Now fix the first element and found out the other 2 element
        for(int i=0;i<nums.length-2;i++){
            //Find other two element using two approach
            int left=i+1;
            int right= nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(sum==0){
                    //add the set and move to find other triplet
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                } else if(sum<0) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
