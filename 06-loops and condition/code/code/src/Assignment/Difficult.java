package Assignment;

import java.util.Scanner;

public class Difficult {
//    Write a program to print the sum of
//    negative numbers, sum of positive even
//    numbers and the sum of positive odd
//    numbers from a list of numbers (N) entered
//    by the user. The list terminates when the
//    user enters a zero.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumOfNegative=0;
        int sumOfPositiveEven=0;
        int sumOfPositiveOdd=0;

        while (true){
            int n = in.nextInt();
            if (n<0){
                sumOfNegative += n;
            }else if (n>0) {
                if (n%2==0){
                    sumOfPositiveEven += n;
                }else {
                    sumOfPositiveOdd += n;
                }
            }else if (n==0) {
                break;
            }
        }
        System.out.println("the sum of all negative numbers is : "+sumOfNegative);
        System.out.println("the sum of all positive even numbers is : "+sumOfPositiveEven);
        System.out.println("the sum of all positive odd numbers is : "+sumOfPositiveOdd);

    }




}
