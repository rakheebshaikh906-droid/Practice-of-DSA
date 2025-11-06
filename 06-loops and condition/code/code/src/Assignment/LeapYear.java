package Assignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a year : ");
        int year = in.nextInt();

        if (year%100==0){
            if (year%400==0){
                System.out.println("it is a leap year");
            }else {
                System.out.println("its not a leap year");
            }
        }else {
            if (year%4==0){
                System.out.println("it is leap year");
            }else {
                System.out.println("its not a leap year");
            }
        }

    }
}
