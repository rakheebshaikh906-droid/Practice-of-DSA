package Assigment;

//https://leetcode.com/problems/largest-perimeter-triangle/description/
//976. Largest Perimeter Triangle

import java.util.Arrays;
public class LargestPerimeterTriangle {
    static void main(String[] args) {
        int[]nums={2,1,2};
        System.out.println(integerParameter(nums));
    }
    static int integerParameter(int[]nums){
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            int c=nums[i];
            int b=nums[i-1];
            int a=nums[i-2];

            if(a+b>c){
                return (a+b+c);
            }
        }
        return 0;
    }
}
