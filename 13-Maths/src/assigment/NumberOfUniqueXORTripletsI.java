package Assigment;

//https://leetcode.com/problems/number-of-unique-xor-triplets-i/description/?envType=daily-question&envId=2026-07-23
//3513. Number of Unique XOR Triplets I

public class NumberOfUniqueXORTripletsI {
    static void main(String[] args) {
        int[]nums={1,2,3,4};
        System.out.println(UniqueXor(nums));
    }
    static int UniqueXor (int[]nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int power = 1;
        while (power <= n) {
            power = power * 2;
        }
        return power;
    }
}
