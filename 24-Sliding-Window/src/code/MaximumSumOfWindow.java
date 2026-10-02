package code;

public class MaximumSumOfWindow {
    static void main(String[] args) {
        int[]nums={2,4,2,1,5,6,7,8,9,2};
        int k=3;
        System.out.println(maxSum(nums,k));
    }
    static int maxSum(int[]nums,int k){
        int n=nums.length;
        int l=0;
        int r=k-1;
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=nums[i];
        }
        int max=sum;
        while(r<n-1){
            sum=sum-nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            max=Math.max(max,sum);
        }
        return max;
    }
}
