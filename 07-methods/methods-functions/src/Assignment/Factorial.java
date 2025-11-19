package Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        long ans = factorial(n);
        System.out.println("factorial : "+ans);
    }
    static long factorial (long n){
//        if (n == 0 || n == 1){
//            System.out.println("1");
//        }
        int i =2;
        int fact =1;
        while (n>=i){
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
