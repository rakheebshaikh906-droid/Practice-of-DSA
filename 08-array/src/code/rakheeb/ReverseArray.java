package code.rakheeb;

import java.util.Arrays;

public class ReverseArray {
    static void main(String[] args) {
        int[]arr={12,34,45,66,78,99,100};
        int[]result=reversearray(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] reversearray(int[]arr){
        int start=0;
        int end=arr.length-1;

        while (start <= end) {
            //swap the number
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        return arr;
    }
}
