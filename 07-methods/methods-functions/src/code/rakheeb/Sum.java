package code.rakheeb;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("sum = "+ans);
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter num 1 : ");
        int num1 = in.nextInt();
        System.out.print("enter num 2 : ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;

    }

}
