package Assigment;

//https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/description/
//2455. Average Value of Even Numbers That Are Divisible by Three

public class AverageValueOfEvenNumbersThatAreDivisibleByThree {
    static void main(String[] args) {
        int[] nums={1,3,6,10,12,15};
        System.out.println(averageVal(nums));
    }
    static int averageVal(int[]nums){
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
               sum+=nums[i];
               count+=1;
            }
        }
        if(count==0){
            return 0;
        }
        return sum/count;
    }
}
