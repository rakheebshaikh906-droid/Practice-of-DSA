package assignment;
//https://leetcode.com/problems/find-the-duplicate-number/description/
//Q.find the duplicates number
//ask in google interview
public class FindDuplicate {
    static void main(String[] args) {
        int[]nums={1,3,4,2,2};
        System.out.println(cyclic(nums));

    }

    static int cyclic(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i]!=i+1){
                int correct = nums[i];
                if (nums[i] != nums[correct]) {
                    //swap them
                    swap(nums, i, correct);
                }else{
                    return nums[i];
                }

            }else{
                i++;
            }

        }
        return -1;
    }
    //write a method for swap the indexes
    static void swap(int[]nums,int first,int secound){
        int temp=nums[first];
        nums[first]=nums[secound];
        nums[secound]=temp;
    }

}