package Assigment;

//https://leetcode.com/problems/xor-operation-in-an-array/description/
//1486. XOR Operation in an Array
public class XOROperation {
    static void main(String[] args) {
        int n=5;
        int start=0;
        System.out.println(xorOperation(n,start));
    }
    static int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            result ^= (start + 2 * i);
        }
        return result;
    }
}