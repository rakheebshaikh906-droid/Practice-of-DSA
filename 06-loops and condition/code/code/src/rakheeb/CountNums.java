package rakheeb;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        // print the number of 3's in n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count = 0;
        while (n>0){
            int rem = n%10;
            if (rem ==3){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}

