package assignment;

//https://leetcode.com/problems/sort-array-by-parity-ii/
//922. Sort Array By Parity II

public class SortArrayByParity2 {
    static void main(String[] args) {
        int []nums={1,4,6,7,8,9,3};
        System.out.println(sortArrayByParityII(nums));

    }
    public static int[] sortArrayByParityII(int[] nums) {
        int left=0;
        int right=1;
        while(left<nums.length && right<nums.length){
            if(nums[left]%2==0){
                left+=2;
            }else if (nums[right]%2!=0){
                right+=2;
            }else{
                swap(nums,left,right);
                left+=2;
                right+=2;
            }
        }
        return nums;
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
