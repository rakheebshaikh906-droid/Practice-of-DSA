package Assigment;

public class ElementSumAndDigitSum {
    static void main(String[] args) {
        int [] nums ={1,15,6,3};
        System.out.println(differenceOfSum(nums));
    }
    static int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=nums[i]%10;
            nums[i]/=10;

            digit+=rem;
        }
        return Math.abs(sum-digit);
    }
}
