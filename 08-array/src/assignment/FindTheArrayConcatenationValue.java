package assignment;

//2562. Find the Array Concatenation Value
//https://leetcode.com/problems/find-the-array-concatenation-value/
public class FindTheArrayConcatenationValue {
    static void main(String[] args) {
        int[]nums={5,14,13,8,12};
        System.out.println(findThe(nums));
    }
    static long findThe(int[]nums){
        int start=0;
        int end=nums.length-1;
        long sum=0;
        while(start<=end) {
            if(start==end){
                sum+=nums[start];
            }else{
                String value=""+nums[start]+nums[end];
                sum+=Long.parseLong(value);
            }
            start++;
            end--;
        }
        return sum;
    }
}
