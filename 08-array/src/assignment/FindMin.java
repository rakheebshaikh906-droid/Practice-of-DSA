package assignment;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
//Q.(154) Find minimum in rotated sorted array
public class FindMin {
    static void main(String[] args) {
        int[]nums={2,2,2,0,1};
        System.out.println(minfind(nums));
    }
    static int minfind(int[]nums){
        int start=0;
        int end= nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            //check is the middle element is greater
            //then the right element
            if(nums[mid]>nums[end]){
                start=mid+1;
            } else if(nums[mid]<nums[end]){
                end=mid;
            }else{
                //if equal, just reduce end to skip duplicate
                end--;
            }
        }
        return nums[start];
    }
}
