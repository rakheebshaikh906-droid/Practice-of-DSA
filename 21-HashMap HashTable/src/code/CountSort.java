package code;

import java.util.Arrays;

public class CountSort {
    static void main(String[] args) {
        int[]array={2,8,8,3,7,9,3,7,2,8,3,6,7};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    static void sort(int[]array){
        if(array==null || array.length<=1){
            return ;
        }
        //find maximum value in array
        int max=array[0];
        for(int num : array){
            if(num>max){
                max=num;
            }
        }

        //create a count freq array
        int[]countFreq=new int[max+1];

        //find the freq of the array
        for(int num : array){
            countFreq[num]++;
        }

        //put in the original array and sort it
        int index=0;
        for(int i=0;i<=max;i++){
            while(countFreq[i]>0){
                array[index]=i;
                index++;
                countFreq[i]--;
            }
        }
    }
}
