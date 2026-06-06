package Assigment;

//https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/description/?envType=daily-question&envId=2026-04-17
//3761. Minimum Absolute Distance Between Mirror Pairs

public class MinimumAbsoluteDistanceBetweenMirrorPairs {
    static void main(String[] args) {
        int[]nums={12,21,45,33,54};
        System.out.println(minMirrorPairDistance(nums));
    }
    static int minMirrorPairDistance(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(reverse(nums[i])==nums[j]) {
                    min = Math.min(min, Math.abs(i - j));
                    return min;
                }
            }
        }
        return -1;

    }
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev;
    }
}
