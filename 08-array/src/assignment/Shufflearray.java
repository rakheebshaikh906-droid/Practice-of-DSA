package assignment;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/description/
//Q.shuffle the array leetcode (1470) question
public class Shufflearray {
    static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        shuffel(nums,n);
        System.out.println(Arrays.toString(nums));
    }
    static int[] shuffel(int[]nums,int n) {

        //create a new array for store output
        int[] arr = new int[2 * n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[count] = nums[i];
            arr[count + 1] = nums[i + n];
            count += 2;
        }
        return arr;//return the answer
    }
}
