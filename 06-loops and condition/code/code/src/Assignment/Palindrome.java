package Assignment;

import java.util.Scanner;

public class Palindrome {
    //Find if a number is palindrome or not
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        int reverse =0;
        while (temp>0){
            int rem = temp%10;
            reverse = (reverse*10) + rem;
            temp /= 10;
        }
        if (n==reverse){
            System.out.println("it is palindrome");
        }else {
            System.out.println("it is not a palindrome");

        }
//        System.out.println(reverse);
//        System.out.println(n);


    }
}
