package code.rakheeb;

import java.util.Arrays;

//Q.Reverse the array
public class ReversingArray {
    static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    //method for reverse the array
    static int[] reverse(int[]arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }
    // method for swap
    static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
