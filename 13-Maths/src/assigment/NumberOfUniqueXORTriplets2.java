package Assigment;

//https://leetcode.com/problems/number-of-unique-xor-triplets-ii/description/?envType=daily-question&envId=2026-07-24
//3514. Number of Unique XOR Triplets II

import java.util.HashSet;
import java.util.Set;

public class NumberOfUniqueXORTriplets2 {
    static void main(String[] args) {
        int[]nums={6,7,8,9};
        System.out.println(uniqueXorTriplet(nums));
    }
    static int uniqueXorTriplet(int[]nums){
        Set<Integer>ans=new HashSet<>();

        //find in pair wise first we find j,k xor
        Set<Integer>pairXor=new HashSet<>();
        for(int j=0;j<nums.length;j++){
            for(int k=j;k<nums.length;k++){
                pairXor.add(nums[j]^nums[k]);
            }
        }

        for(int i : nums){
            for(int xor : pairXor){
                ans.add(i^xor);
            }
        }
        return ans.size();
    }

    //this was optimize solution of this question
    static int optimizeSolution(int[]nums){
        final int MAX_XOR = 2048;

        boolean[] pairXor = new boolean[MAX_XOR];
        boolean[] tripletXor = new boolean[MAX_XOR];

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pairXor[nums[i] ^ nums[j]] = true;
            }
        }

        for (int x = 0; x < MAX_XOR; x++) {
            if (!pairXor[x]) continue;

            for (int v : nums) {
                tripletXor[x ^ v] = true;
            }
        }

        int count = 0;
        for (boolean exists : tripletXor) {
            if (exists) count++;
        }

        return count;
    }
}
