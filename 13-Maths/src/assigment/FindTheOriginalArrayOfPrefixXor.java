package Assigment;

//https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/
//2433. Find The Original Array of Prefix Xor

import java.util.Arrays;
public class FindTheOriginalArrayOfPrefixXor {
    static void main(String[] args) {
        int[]pref={5,2,0,3,1};
        System.out.println(Arrays.toString(findArray(pref)));
    }
    static int[] findArray(int[]pref){
        int[]arr=new int[pref.length];
        int index=1;
        arr[0]=pref[0];
        for(int i=1;i< pref.length;i++){
            arr[index]=pref[i]^pref[i-1];
            index++;
        }
        return arr;
    }
}
