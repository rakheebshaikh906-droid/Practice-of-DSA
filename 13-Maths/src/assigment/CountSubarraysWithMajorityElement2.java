package Assigment;

//https://leetcode.com/problems/count-subarrays-with-majority-element-ii/description/?envType=daily-question&envId=2026-06-26
//3739. Count Subarrays With Majority Element II

public class CountSubarraysWithMajorityElement2 {
    static void main() {
        int[]nums={1,2,2,3};
        int target=2;
        System.out.println(CountSubarray(nums,target));
    }
    static long CountSubarray(int[]nums,int target){
        long count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                nums[i]=1;
            }else{
                nums[i]=-1;
            }

        }
        int[]prefix=new int[n];
        prefix[0]=nums[0];

        for(int k=1;k<n;k++){
            prefix[k]=prefix[k-1]+nums[k];
        }
        int shift = n;
        int[] freq = new int[2 * n + 1];

        freq[shift] = 1;

        long valid = 0;
        int lastSum = 0;

        for (int i = 0; i < n; i++) {
            if (prefix[i] > lastSum) {
                valid += freq[lastSum + shift];
            } else {
                valid-=freq[prefix[i]+shift];
            }

            count+= valid;
            freq[prefix[i] + shift]++;
            lastSum = prefix[i];
        }
        return count;
    }
}
