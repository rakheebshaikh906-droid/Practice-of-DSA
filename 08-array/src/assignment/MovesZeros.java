package assignment;
//https://leetcode.com/problems/move-zeroes/description/
//Leetcode question(283)
import java.util.Arrays;
public class MovesZeros {
    static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        move(nums);
        System.out.println(Arrays.toString(nums));
    }
    //method for moveszeros
    static void move(int[]nums){
        //start with the first position
        int insertPosition=0;
        //move all non zero element to the front
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertPosition]=nums[i];
                insertPosition++;
            }
        }
        //fill the remaining position with zero
        while (insertPosition< nums.length){
            nums[insertPosition++]=0;
        }
    }
}
