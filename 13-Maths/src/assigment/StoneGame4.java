package Assigment;

//https://leetcode.com/problems/stone-game-ix/
//2029. Stone Game IX

public class StoneGame4 {
    static void main(String[] args) {
        int[]stones={5,1,2,4,3};
        System.out.println(stoneGameIX(stones));

    }
    static boolean stoneGameIX(int[] stones) {
        int count0=0;
        int count1=0;
        int count2=0;
        int n=stones.length;

        for(int num : stones){
            if(num%3==0){
                count0++;
            }else if( num%3==1){
                count1++;
            }else if(num%3==2){
                count2++;
            }
        }
        if(count0==n){
            return false;
        }
        if (count0 % 2 == 0) {
            return count1 > 0 && count2 > 0;
        }
        return Math.abs(count1 - count2) > 2;
    }
}
