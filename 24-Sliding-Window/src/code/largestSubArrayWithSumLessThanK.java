package code;

public class largestSubArrayWithSumLessThanK {
    static void main(String[] args) {
        int[]nums={2,3,4,5,1,2,6,7,8,9};
        int k=12;
        System.out.println(largestSubarrayLength(nums,k));

    }
    static int largestSubarrayLength(int[]nums,int k){
        int maxLen=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++) {
                sum += nums[j];
                if (sum <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else if (sum > k) {
                    break;

                }
            }
        }
        return maxLen;
    }
}
