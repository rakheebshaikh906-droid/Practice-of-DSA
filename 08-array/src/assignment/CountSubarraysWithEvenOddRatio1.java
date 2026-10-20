package assignment;

//https://leetcode.com/problems/count-subarrays-with-even-odd-ratio-i/
//4011. Count Subarrays With Even Odd Ratio I

public class CountSubarraysWithEvenOddRatio1 {
    static void main(String[] args) {
        int[]nums={1,2,1,2};
        int a=3;
        int b=2;

        System.out.println(countRatioSubarrays(nums,a,b));

    }
    public static int countRatioSubarrays(int[] nums, int a, int b) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int even=0;
            int odd=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0){
                    even++;
                }else{
                    odd++;
                }
                if(even*b<=odd*a){
                    count++;
                }
            }
        }
        return count;
    }
}
