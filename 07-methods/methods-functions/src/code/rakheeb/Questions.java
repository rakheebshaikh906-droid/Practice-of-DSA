package code.rakheeb;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        /*
        Q1:
        take input  n amstrong or not
        Q2:
        print all three digit amstrong numbers
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isAmstrong(n);
        System.out.println(ans);
        // use for loop here in main classs for 3 digit
    }
    static boolean isAmstrong(int n ){
        int orignal = n;
        int sum =0;
        while (n>0){
            int rem = n%10;
            sum += rem*rem*rem;
            n /=10;
        }
        return orignal==sum;
    }


}
