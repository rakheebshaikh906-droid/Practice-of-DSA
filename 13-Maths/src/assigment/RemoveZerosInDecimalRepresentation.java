package Assigment;

//https://leetcode.com/problems/remove-zeros-in-decimal-representation/description/?envType=problem-list-v2&envId=math
//3726. Remove Zeros in Decimal Representation

public class RemoveZerosInDecimalRepresentation {
    static void main(String[] args) {
        long n=1020030;
        System.out.println(removeZeros(n));
    }
    static long removeZeros(long n) {
        String s = String.valueOf(n);

        s = s.replace("0", "");

        long num = Long.parseLong(s);
        return num;

    }
}
