package Assigment;

//https://leetcode.com/problems/jump-game-ii/description/
//45. Jump Game II

public class JumpGame2 {
    static void main(String[] args) {
        int[]nums={2,3,1,1,4};
        System.out.println(jump(nums));
    }
    public static  int jump(int[] nums) {
        int jump=0,l=0,r=0;
        while(r<nums.length-1){
            int forward=0;
            for(int i=l;i<=r;i++){
                forward=Math.max(forward,i+nums[i]);
            }
            l=r+1;
            r=forward;
            jump++;
        }
        return jump;
    }
}
