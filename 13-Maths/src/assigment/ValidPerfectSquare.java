package Assigment;

//https://leetcode.com/problems/valid-perfect-square/description/?envType=problem-list-v2&envId=math
//367. Valid Perfect Square
public class ValidPerfectSquare {
    static void main(String[] args) {
        int num=16;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num){
        int start=1;
        int end=num;
            while (start < end) {
                long mid = start + (end - start) / 2;
                long sqrt=mid*mid;

                if (sqrt== num) {
                    return true;
                }
                if (sqrt< num) {
                    start =(int) mid + 1;
                } else {
                    end = (int) mid - 1;
                }
            }
        return false;
    }
}
