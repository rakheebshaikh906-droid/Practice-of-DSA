package Assigment;

//https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/description/?envType=problem-list-v2&envId=math
//1442. Count Triplets That Can Form Two Arrays of Equal XOR

public class CountTripletsThatCanFormTwoArraysOfEqualXOR {
    static void main(String[] args) {
        int[]arr={2,3,1,6,7};
        System.out.println(countTriplets(arr));
    }
    static int countTriplets(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] ^ arr[i];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if ((prefix[k + 1] ^ prefix[i]) == 0) {
                    count += (k - i);
                }
            }
        }
        return count;
    }
}
