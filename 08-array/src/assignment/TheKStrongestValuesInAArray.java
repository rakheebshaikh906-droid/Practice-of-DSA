package assignment;

//https://leetcode.com/problems/the-k-strongest-values-in-an-array/description/?envType=problem-list-v2&envId=two-pointers
//1471. The k Strongest Values in an Array

import java.util.Arrays;
public class TheKStrongestValuesInAArray {
    static void main(String[] args) {
        int[]arr={6,7,11,7,6,8};
        int k=5;
        System.out.println(Arrays.toString(getStrongest(arr,k)));
    }
    static int[] getStrongest(int[] arr, int k) {
        int[]ans=new int[k];
        int index=0;
        Arrays.sort(arr);
        int left=0;
        int n= arr.length;
        int right=n-1;
        int mid=arr[((n-1)/2)];
        while(index<k){
            int leftStrength = Math.abs(arr[left] - mid);
            int rightStrength = Math.abs(arr[right] - mid);

            if (rightStrength > leftStrength) {
                ans[index++] = arr[right--];
            } else if (rightStrength < leftStrength) {
                ans[index++] = arr[left++];
            } else {
                // tie → bigger value
                if (arr[right] > arr[left]) {
                    ans[index++] = arr[right--];
                } else {
                    ans[index++] = arr[left++];
                }
            }
        }
        return ans;

    }
}

