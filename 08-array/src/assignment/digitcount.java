package assignment;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//Q.find nos of number that have even no of digit
public class digitcount {
        public static void main(String[] args) {
            int[] nums = {12, 345, 2, 6, 7896};
            System.out.println(findEvenDigitNumber(nums));
        }

        static int findEvenDigitNumber(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                int digit = digitcount(nums[i]);
                if (digit % 2 == 0) {
                    count++;
                }
            }
            return count;
        }

        static int digitcount(int num) {
            int digit = 0;
            if (num == 0) {
                return 1;
            }
            while (num > 0) {
                digit++;
                num = num / 10;
            }
            return digit;
        }
    }

