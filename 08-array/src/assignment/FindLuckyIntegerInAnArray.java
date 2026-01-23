package assignment;

//https://leetcode.com/problems/find-lucky-integer-in-an-array/?envType=problem-list-v2&envId=array
//1394. Find Lucky Integer in an Array

public class FindLuckyIntegerInAnArray {
    static void main(String[] args) {
        int[]arr={1,2,2,3,3,3};
        System.out.println(findLucky(arr));
    }
    static int findLucky(int[]arr){
        int[]freq=new int[501];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=freq.length-1;i>=1;i--){
            if(freq[i]==i){
                return i;
            }
        }
        return -1;
    }
}
