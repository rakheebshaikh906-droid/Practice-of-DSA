package Assigment;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-product-of-three-numbers/description/?envType=problem-list-v2&envId=math
//628. Maximum Product of Three Numbers
public class ProductOfThree {
    static void main(String[] args) {
        int[]nums={1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
    //Steps:
    //Array ko sort karo
    //Last ke 3 elements → largest
    //First ke 2 elements → smallest (negative ho sakte hain)
    //Dono products calculate karke max return karo
    static int maximumProduct(int[]nums){
        Arrays.sort(nums);
        int m=nums.length;

        int c1=nums[m-1]*nums[m-2]*nums[m-3];
        int c2=nums[0]*nums[1]*nums[m-1];

        return Math.max(c1,c2);
    }
}
