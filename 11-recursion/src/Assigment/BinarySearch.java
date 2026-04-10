package Assigment;

//https://leetcode.com/problems/binary-search/
//704. Binary Search
public class BinarySearch {
    static void main(String[] args) {
        int[]nums={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums, int target) {
        return binary(nums, target, 0, nums.length - 1);
    }
    //we write new function because in leetcode only nums,target arguments provide
    //we need start and end
    //because of this we write a new method
    static int binary(int[] nums, int target, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] > target){
            return binary(nums, target, start, mid - 1);
        }
        return binary(nums, target, mid + 1, end);
    }
}
