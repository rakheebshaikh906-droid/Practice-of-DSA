package code.rakheeb;

import java.util.Arrays;

//Q.sort the array using cyclic sort.
public class CyclicSort {
    static void main(String[] args) {
        int[]arr={8,7,6,4,3,2,1,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    //write a method for cyclic sort
    static void cyclic(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                //swap them
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    //write a method for swap the indexes
    static void swap(int[]arr,int first,int secound){
        int temp=arr[first];
        arr[first]=arr[secound];
        arr[secound]=temp;
    }
}
