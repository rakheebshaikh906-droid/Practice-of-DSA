package code.rakheeb;

import java.util.Arrays;

//Q.find maximum in 2D array
public class Maxin2D {
    static void main(String[] args) {
        int[][]arr={
                {23,45,43},
                {12,89,54},
                {65,87,13}
        };
        int[]ans=max(arr);
        System.out.println(Arrays.toString(ans));
    }
    //method for finding max in 2D array
    static int[] max(int[][]arr){
        int maxvalue=Integer.MIN_VALUE;
        int row=-1;
        int col=-1;
        for(int i=0; i< arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]>maxvalue){
                    maxvalue=arr[i][i];
                    row=i;
                    col=j;
                }
            }
        }
        return new int[]{row,col};
    }
}
