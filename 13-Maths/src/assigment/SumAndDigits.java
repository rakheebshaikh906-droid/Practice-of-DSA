package Assigment;

//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/?envType=problem-list-v2&envId=math
//2535. Difference Between Element Sum and Digit Sum of an Array
public class SumAndDigits {
    static void main(String[] args) {
        int[]nums={1,15,6,3};
        System.out.println(differenceOfSum(nums));
    }
    static int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int x = nums[i];
            while (x > 0) {
                digit += x % 10;
                x /= 10;
            }
        }
        return Math.abs(sum-digit);
    }
}
