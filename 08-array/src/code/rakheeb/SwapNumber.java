package code.rakheeb;

import java.util.Arrays;

//Q.swap the numbers.
public class SwapNumber {
    static void main(String[] args) {
        int[]arr={4,5,6,7,8};
        swap(arr,2,4);//call the function
        System.out.println(Arrays.toString(arr));
    }

    //method for swaping the numbers/element
    static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
