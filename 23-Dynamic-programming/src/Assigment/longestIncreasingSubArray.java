package Assigment;

//
public class longestIncreasingSubArray {
    static void main(String[] args) {
        int[]nums={1,3,5,4,2,3,4,5};
        System.out.println(findLengthOfLCIS(nums));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int len=1;
        int max=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                len++;
            }else{
                len=1;
            }
            max=Math.max(max,len);
        }
        return max;
    }
}
