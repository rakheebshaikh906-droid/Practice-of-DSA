package Assigment;

public class SumOfGoodNumbers {
    static void main(String[] args) {
        int[]nums={1,3,2,1,5,4};
        int k=2;
        System.out.println(goodNumber(nums,k));
    }
    static int goodNumber(int[]nums,int k){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i - k >= 0 && i + k < nums.length) {
                if(nums[i] > nums[i - k] || nums[i] > nums[i + k]) {
                    sum += nums[i];
                }
            }
        }
        return sum;
    }

}
