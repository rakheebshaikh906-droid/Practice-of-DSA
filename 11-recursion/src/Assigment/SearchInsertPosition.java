package Assigment;

//https://leetcode.com/problems/search-insert-position/
//35. Search Insert Position
public class SearchInsertPosition {
    static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=2;
        System.out.println(search(nums,target));
    }
    static int search(int [] nums,int target){
        return binarySearch(nums,target,0,nums.length-1);
    }
    //we write new function because in leetcode only nums,target arguments provide
    //we need start and end
    //because of this we write a new method
    static int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return start; // if the target is not present they
                          //simply return which position they present
        }
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (target < nums[mid]) {
            return binarySearch(nums, target, start, mid - 1);
        } else {
            return binarySearch(nums, target, mid + 1, end);
        }
    }
}
