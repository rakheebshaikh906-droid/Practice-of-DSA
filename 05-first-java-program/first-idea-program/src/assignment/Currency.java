package assignment;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("in rupees : ");
        int rupee = in.nextInt();

        double USD = 0.0115107 * rupee;
        System.out.println("USD : "+ USD);
    }
}
