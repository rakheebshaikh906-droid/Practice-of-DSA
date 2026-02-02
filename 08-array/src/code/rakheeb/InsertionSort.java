package code.rakheeb;
//Q.sort the array using insertion sort algorithm
import java.util.Arrays;

public class InsertionSort {
    static void main(String[] args) {
        int[]arr={4,5,2,1,3,8,9};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[]arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void swap(int[]arr,int first,int secound){
        int temp=arr[first];
        arr[first]=arr[secound];
        arr[secound]=temp;
    }
}
