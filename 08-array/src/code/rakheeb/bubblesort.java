package code.rakheeb;

import java.util.Arrays;

//Q.apply bubble sort on the array
public class bubblesort {
    static void main(String[] args) {
        int[]arr={5,3,1,2,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[]arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i< arr.length;i++){
            swapped=false;
            //for each steps maximum value come out the last index
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if you don't swap the particular value of i,its means array is already sorted
            if(!swapped){ // you also write this thing like(swapped==false) break;
                break;
            }
        }
    }
}
