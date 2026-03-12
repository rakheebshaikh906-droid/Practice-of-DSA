package assignment;

//https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
//1346. Check If N and Its Double Exist

import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {

    static boolean checkIfExist(int[] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && (arr[i]==2*arr[j] || arr[j]==2*arr[i])){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 2, 5, 3};

        boolean result = checkIfExist(arr);

        System.out.println("Does N and 2*N exist? " + result);
    }
}