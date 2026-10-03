package code;

public class MaximumSubarraySumWithLengthDivisibleByK {
    static void main(String[] args) {
        int[]nums={-1,-2,-3,-4,-5};
        int k=4;

        System.out.println(maxSubarraySum(nums,k));
    }
    public static long maxSubarraySum(int[] nums, int k) {
        long MaxAns=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if((j-i+1)%k==0){
                    MaxAns=Math.max(MaxAns,sum);
                }
            }
        }
        return MaxAns;
    }
}
