package assignment;

//https://leetcode.com/problems/minimum-common-value/description/?envType=problem-list-v2&envId=binary-search
//2540. Minimum Common Value

public class MinimumCommonValue {
    static void main(String[] args) {
        int[]nums1={1,2,3};
        int[]nums2={2,4};
        System.out.println(getCommon(nums1,nums2));
    }
    static int getCommon(int[] nums1, int[] nums2) {
        int left=0;
        int right=0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]==nums2[right]){
                return nums1[left];
            }else if (nums1[left]<nums2[right]){
                left++;
            }else{
                right++;
            }

        }
        return -1;

    }
}
