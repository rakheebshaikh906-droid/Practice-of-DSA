package Assigment;

//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/description/?envType=problem-list-v2&envId=math
//1588. Sum of All Odd Length Subarrays

public class SumOfOddLengthSubArray {
    static void main(String[] args) {
        int[]arr={1,4,2,5,3};
        System.out.println(sumOddLength(arr));
    }
    static int sumOddLength(int[]arr){
        int count=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            count += ((i + 1) * (n - i) + 1) / 2 * arr[i];
        }
        return count;
    }

}
