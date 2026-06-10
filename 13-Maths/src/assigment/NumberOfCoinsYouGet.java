package Assigment;

//https://leetcode.com/problems/maximum-number-of-coins-you-can-get/description/
//1561. Maximum Number of Coins You Can Get

import java.util.Arrays;

public class NumberOfCoinsYouGet {
    static void main(String[] args) {
        int[]piles={9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(piles));
        //System.out.println(maxCoins2(piles));
    }
    static int maxCoins(int[] piles) {
        // 1 2 3 4 5 6 7 8 9
        //sort the array
        Arrays.sort(piles);
        int n=piles.length;
        int length=n/3;
        int sum=0;
        int indx=n-2;

        for(int i=0;i<length;i++){
            sum+=piles[indx];
            indx-=2;
        }
        return sum;
    }
//    static int maxCoins2(int[] piles) {
//        Arrays.sort(piles);
//
//        int sum=0;
//        int n = piles.length / 3 ;
//
//        for(int i = piles.length-2 ; i >= n ; i = i-2){
//            sum += piles[i];
//        }
//
//        return sum;
//    }

}
