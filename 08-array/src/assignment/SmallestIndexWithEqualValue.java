package assignment;

//https://leetcode.com/problems/smallest-index-with-equal-value/submissions/1894225752/?envType=problem-list-v2&envId=array
//2057. Smallest Index With Equal Value

public class SmallestIndexWithEqualValue {
    static void main(String[] args) {
        int[]nums={0,1,2};
        System.out.println(smallestEqual(nums));
    }
    static int smallestEqual(int[]nums){
        for(int i=0;i<nums.length;i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
