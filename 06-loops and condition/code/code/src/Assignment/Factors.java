package Assignment;

import java.util.Scanner;

public class Factors {
//    Input a number and print
//    all the factors of that number (use loops).
public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("enter the number : ");
    int num = in.nextInt();

    int count = 1;
    while (count<=num){
        if (num%count==0){
            System.out.println(count);
        } count++;
    }


     }
}


