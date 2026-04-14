package assignment;

//https://leetcode.com/problems/number-of-perfect-pairs/?envType=problem-list-v2&envId=two-pointers
//3649. Number of Perfect Pairs

import java.util.Arrays;

public class NumberOfPerfectPairs {
    static void main(String[] args) {
        int[]nums={0,1,2,3};
        System.out.println(perfectPair(nums));
    }
    static long perfectPair(int[]nums){
        long count=0;
        for(int i=0;i< nums.length;i++){

            for(int j=i+1;j<nums.length;j++){
                int a=nums[i], b=nums[j];
                int minValue=Math.min(Math.abs(a-b),Math.abs(a+b));
                int maxvalue=Math.max(Math.abs(a-b),Math.abs(a+b));
                int min = Math.min(Math.abs(a), Math.abs(b));
                int max= Math.max(Math.abs(a), Math.abs(b));
                if(minValue<= min && maxvalue>=max ){
                    count++;
                }
            }
        }
        return count;
    }

    //optimal solution o(n log n)
    public long perfectPairs2(int[] nums) {
        int n = nums.length;

        // Step 1: convert to absolute
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        // Step 2: sort
        Arrays.sort(nums);

        long count = 0;
        int j = 0;

        // Step 3: two pointers
        for (int i = 0; i < n; i++) {
            while (j < n && nums[j] <= 2L * nums[i]) {
                j++;
            }
            count += (j - i - 1);
        }

        return count;
    }
}
