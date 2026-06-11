package Assigment;

public class PerfectNumber {
    static void main(String[] args) {
        int nums=28;
        System.out.println(checkPerfectNumber(nums));
    }
    static boolean checkPerfectNumber(int nums){
        if (nums <= 1) return false;
        int sum = 1; // 1 is always a proper divisor
        for (int i = 2; i<=Math.sqrt(nums); i++) {
            if (nums % i == 0) {
                sum =sum + i;
                if (i != nums / i) {
                    sum =sum + nums / i;
                }
            }
        }
        return sum == nums;
    }
}
