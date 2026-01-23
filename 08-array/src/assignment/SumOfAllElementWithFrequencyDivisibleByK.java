package assignment;

//https://leetcode.com/problems/sum-of-elements-with-frequency-divisible-by-k/description/?envType=problem-list-v2&envId=array
//3712. Sum of Elements With Frequency Divisible by K

public class SumOfAllElementWithFrequencyDivisibleByK {
    static void main(String[] args) {
        int[]nums={1,2,2,3,3,3,3,4};
        int k=2;
        System.out.println(sumDivisibleByK(nums,k));
    }
    static int sumDivisibleByK(int[] nums, int k) {
        int[]freq=new int[101];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]>1){
                if(freq[nums[i]]%k==0){
                    sum+=nums[i];
                }
            }
        }
        return sum;
    }

    //best and optimize approach
    static int sumDivisibleByK2(int[] nums, int k) {
        int[] freq = new int[101];
        int sum = 0;

        for (int num : nums) {
            freq[num]++;
        }

        for (int num = 0; num <= 100; num++) {
            if (freq[num] % k == 0) {
                sum += num * freq[num];
            }
        }

        return sum;
    }
}
