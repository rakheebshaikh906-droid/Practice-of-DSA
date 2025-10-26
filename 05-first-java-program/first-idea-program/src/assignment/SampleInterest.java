package assignment;

import java.util.Scanner;

public class SampleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the principle : ");
        int p = in.nextInt();

        System.out.print("enter the rate in % : ");
        float r = in.nextFloat();

        System.out.print("enter the time in years : ");
        int t = in.nextInt();

        float result = (p*r*t)/100;
        System.out.println("the sample interst is : "+result);

    }
//    Write a program to input principal, time, and rate
//    (P, T, R) from the user and find Simple Interest.
}
