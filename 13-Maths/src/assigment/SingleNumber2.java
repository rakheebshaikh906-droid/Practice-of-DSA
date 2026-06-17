package Assigment;

//https://leetcode.com/problems/single-number-ii/description/
//137. Single Number II
public class SingleNumber2 {
    static void main(String[] args) {
        int[]nums={2,2,3,2};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        int result = 0;

        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            for (int num : nums) {
                if ((num >> bit & 1) == 1) {
                    count++;
                }
            }

            // If this bit appears odd mod 3, set it in result
            if (count % 3 != 0) {
                result |= (1 << bit);
            }
        }

        return result;
    }
}
