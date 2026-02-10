package code.rakheeb;

import java.util.Arrays;

//Q.find the minimum element in 2d array
public class Minin2D {
    static void main(String[] args) {
        int[][]arr={
                {23,45,43},
                {12,89,54},
                {65,87,13}
        };
        int[]ans=min(arr);
        System.out.println(Arrays.toString(ans));
    }
    //method for finding min in 2D array
    static int[] min (int[][]arr){
        int minvalue=Integer.MAX_VALUE;
        int row=-1;
        int col=-1;
        for(int i=0; i< arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]<minvalue){
                    minvalue=arr[i][j];
                    row=i;
                    col=j;
                }
            }
        }
        return new int[]{row,col};
    }
}
