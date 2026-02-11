package code.rakheeb;
import java.util.Arrays;
import java.util.Scanner;
//Q.Array passing in function.
public class PassingFunction {
    static void main(String[] args) {
        int[]arr={3,4,5,6};
        //System.out.println(Arrays.toString(arr));
        // call the function here
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    //create a function for change the number in array
    static void change(int[]arr){
        arr[0]=10;// its change the value of index 2 to 10.
        arr[1]=12;//its change the value of index 1 to 12.
    }
}
