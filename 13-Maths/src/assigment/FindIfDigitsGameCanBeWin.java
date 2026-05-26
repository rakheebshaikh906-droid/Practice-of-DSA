package Assigment;

//https://leetcode.com/problems/find-if-digit-game-can-be-won/description/?envType=problem-list-v2&envId=math
//3232. Find if Digit Game Can Be Won

public class FindIfDigitsGameCanBeWin {
    static void main(String[] args) {
        int[]nums={1,2,3,4,5,14};
        System.out.println(canAliceWin(nums));
    }
    static boolean canAliceWin(int[] nums) {
        int countSum1=0;
        int countSum2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                countSum1+=nums[i];
            }else{
               countSum2+=nums[i];
            }

        }
        return countSum1!=countSum2;
    }
}
