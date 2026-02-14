package code.rakheeb;

import java.util.Arrays;
//Q.write a simple java array program to store 5 roll numbers.
public class Simplestore {
    public static void main(String[] args){
        int[] rollnumbers={12,9,23,11,21};
        System.out.println(Arrays.toString(rollnumbers));
    }
}

// All the type of data in array should be same
//Ex.int[] numbers={12,23,32,13,24}; -> this allow because all the data in array same but
// int[] numbers={12,23,43,"rakheeb",9.4,89}; -> this is not allow because different data types are present like string,float,integer
