package Assignment;

import java.util.Scanner;

public class Summation {
//    Take integer inputs till the user enters 0
//    and print the sum of all numbers (HINT: while loop)
    public static void main(String[] args) {

        int sum =0;

        while (true){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();


            if (n!=0){
                sum += n;
            }else {
                break;
            }
        }
        System.out.println("sum : "+sum);

    }
}
