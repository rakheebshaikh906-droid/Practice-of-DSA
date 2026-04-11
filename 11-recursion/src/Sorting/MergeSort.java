package Sorting;

import java.util.Arrays;
public class MergeSort {
    static void main(String[] args) {
        int[]arr={2,3,1,7,6,4,5,9,8};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));

        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[]arr){
        //base case
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;

        //divide into two parts of array
        int[]left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[]right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    private static int[] merge(int[]first,int[]second){
        //create a new mix array for merge both dividing parts
        int[] mix= new int[first.length+ second.length];

        //take a pointers for first half,second half and mix array
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not complete
        //copy the remaining element
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }


    //In-Place Merge Sort
    static void mergeSortInPlace(int[]arr,int s ,int e){
        //base case
        if(e-s==1){
            return;
        }
        int mid=s+(e-s)/2;

        //divide into two parts of array
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

         mergeInPlace(arr,s,mid,e);
    }
    private static void mergeInPlace(int []arr,int s,int mid,int e){
        //create a new mix array for merge both dividing parts
        int[] mix= new int[e-s];

        //take a pointers for first half,second half and mix array
        int i=s;
        int j=mid;
        int k=0;

        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not complete
        //copy the remaining element
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        //for sorting in same array
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
}
