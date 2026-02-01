package code.rakheeb;

import java.util.Arrays;
//Arrays of primitives
//input using for loops in array
//Q.print the number from 1 to 10 using for loop in array.
public class Forlooparray {
    static void main(String[] args) {
        int[]arr= new int[10];// create array of size 10
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;//store value from 1 to 10
        }
        System.out.println(Arrays.toString(arr));
    }
}
