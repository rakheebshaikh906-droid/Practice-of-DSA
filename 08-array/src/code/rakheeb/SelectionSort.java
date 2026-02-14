package code.rakheeb;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[]arr={3,1,5,4,-43,2,6,8,9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
        for(int i=0;i< arr.length;i++){
            //find the maximum item in the remaining array and swap with the correct index
            int last= arr.length-i-1;
            int maxindex=getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
            //write the method that used for find the min value in the array and swap with the first element
            int minindex=getminIndex(arr,i, arr.length-1);
            swap(arr,i,minindex);
        }
    }
    // create a method/function for swapping a numbers
    static void swap(int[]arr,int first,int secound){
        int temp=arr[first];
        arr[first]=arr[secound];
        arr[secound]=temp;
    }

    //create a method/function for find the maximum element in the array

    static int getmaxindex(int[]arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static int getminIndex(int[]arr,int start,int end){
        int min=start;
        for(int i=start;i<=end;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }
}
